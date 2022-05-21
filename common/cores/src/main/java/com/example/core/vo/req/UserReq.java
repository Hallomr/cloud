package com.example.core.vo.req;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserReq extends PageReq{
    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}