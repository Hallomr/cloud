package com.example.business.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.core.model.business.UserInfo;
import com.example.core.vo.req.UserReq;
import com.example.core.vo.resp.UserResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserInfoMapper extends BaseMapper<UserInfo> {

    Page<UserResp> getUserList(Page page, @Param("userReq") UserReq userReq);

    void insertBatch(@Param("users") List<UserInfo> users);

    List<Map<String,Object>> selectMap();
}
