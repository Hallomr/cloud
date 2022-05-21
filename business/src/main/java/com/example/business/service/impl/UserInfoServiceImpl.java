package com.example.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.business.mapper.UserInfoMapper;
import com.example.business.service.UserInfoService;
import com.example.core.model.business.UserInfo;
import com.example.core.vo.req.UserReq;
import com.example.core.vo.resp.PageResp;
import com.example.core.vo.resp.UserResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolation;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author generator
 * @since 2019-11-14
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public PageResp<UserResp> getUserList(UserReq userReq) {
        Page page = new Page(userReq.getPageNum(), userReq.getPageSize());
        Page<UserResp> userRespPage = userInfoMapper.getUserList(page, userReq);
        PageResp<UserResp> pageResp = new PageResp(userRespPage);
        return pageResp;
    }

    @Override
    public List<Map<String, Object>> selectMap() {
        return userInfoMapper.selectMap();
    }
}
