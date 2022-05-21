package com.example.core.anno;

import java.lang.annotation.*;
/**
 * 打印请求参数日志标签
 * */
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface ParamLogAnno {
}
