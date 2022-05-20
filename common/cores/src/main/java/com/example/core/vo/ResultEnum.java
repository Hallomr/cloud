package com.example.core.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.formula.functions.T;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ResultEnum {
    SUCCESS("200", "请求已经成功处理"),
    BAD_REQUEST("400", "请求语法错误"),
    FORBIDDEN("403", "请求被理解拒绝执行"),
    NOT_FOUND("404", "资源未找到"),
    METHOD_NOT_ALLOWED( "405", "请求方法不允许被执行"),
    PARAMETER_ERROR("406","请求参数错误"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误"),
    /** 自定义业务状态码*/
    OPERATION_EXCEL_ERROR("1001","上传文件异常")
    ;
    private String code;
    private String message;

    public Result get(){
        return  new Result(this);
    }

    public Result<T> get(T data){
        return new Result(this,data);
    }

    public Result get(String cause){
        return new Result(this.code,this.message,cause);
    }
}