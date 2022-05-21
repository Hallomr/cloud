package com.example.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.core.model.business.UserInfo;
import com.example.core.vo.req.UserReq;
import com.example.core.vo.resp.PageResp;
import com.example.core.vo.resp.UserResp;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author generator
 * @since 2019-11-14
 */
public interface UserInfoService extends IService<UserInfo> {

    PageResp<UserResp> getUserList(UserReq userReq);

    List<Map<String,Object>> selectMap();
}