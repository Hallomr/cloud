package com.example.core.vo.resp;

import com.example.core.enums.IEnum;
import com.example.core.enums.StatusEnum;
import com.example.core.model.business.Content;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResp  {
    private Integer id;

    private String password;

    private String username;

    @IEnum(StatusEnum.class)
    private Integer status;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Content content;
}