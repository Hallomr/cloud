package com.example.business.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.api.service.BusinessClient;
import com.example.business.mapper.RouteMapper;
import com.example.business.service.UserInfoService;
import com.example.core.anno.LoginAnno;
import com.example.core.anno.ParamLogAnno;
import com.example.core.dto.business.RoutingExcelDto;
import com.example.core.model.business.Route;
import com.example.core.utils.ExcelUtils;
import com.example.core.vo.req.UserReq;
import com.example.core.vo.resp.PageResp;
import com.example.core.vo.resp.UserResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.stream.Collectors;

@LoginAnno
@RestController
@Slf4j
public class BusinessController implements BusinessClient {
    @Autowired
    private RouteMapper routeMapper;

    @Autowired
    private UserInfoService userInfoService;

    @Override
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String business(){
        System.out.println("========= business =========");
        int i= 1/0;
        return "business success";
    }

    @GetMapping("/download")
    public void download(HttpServletResponse response){
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");
            String fileName = URLEncoder.encode("导出", "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");

            QueryWrapper<Route> routeQueryWrapper = new QueryWrapper<>();
            List<Route> routes = routeMapper.selectList(routeQueryWrapper);

            ExcelUtils.export(response.getOutputStream(),routes,RoutingExcelDto.class);
        } catch (Exception e) {
            log.info("导出excel异常：{}",e.getMessage());
        }
    }

    @PostMapping("/upload")
    public void upload(MultipartFile file) throws IOException {
        try {
            List<RoutingExcelDto> parse = ExcelUtils.parse(file.getInputStream(), RoutingExcelDto.class);
            //入数据库
            List<Route> collect = parse.stream().map(routingExcelDto -> {
                Route route = new Route();
                BeanUtils.copyProperties(routingExcelDto, route);
                return route;
            }).collect(Collectors.toList());
            System.out.println(collect);
        } catch (Exception e) {
            log.info("导出excel异常：{}",e.getMessage());
        }
    }

    @ParamLogAnno
    @GetMapping(value = "/paramLog")
    public String paramLog(@RequestParam("param") String param){
        return param;
    }

    @PostMapping("/userInfos")
    public PageResp<UserResp> userList(@Validated @RequestBody UserReq userReq){
        PageResp<UserResp> userList = userInfoService.getUserList(userReq);
        return userList;
    }
}
