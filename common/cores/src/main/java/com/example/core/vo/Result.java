package com.example.core.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private String code;
    private String msg;
    private T data;
    private String cause;

    public Result(String code, String msg, String cause) {
        this.code = code;
        this.msg = msg;
        this.cause = cause;
    }

    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
    }

    public Result(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.msg = resultEnum.getMessage();
        this.data = data;
    }

    public  Result(String code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public Result success() {
        return new Result(ResultEnum.SUCCESS);
    }

    public Result fail() {
        return new Result(ResultEnum.INTERNAL_SERVER_ERROR);
    }

    public Result<T> get(T data) {
        return new Result(ResultEnum.SUCCESS, data);
    }

    public Result get(String cause) {
        return new Result(this.code, this.msg, cause);
    }
}