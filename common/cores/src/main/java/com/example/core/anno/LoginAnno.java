package com.example.core.anno;

import java.lang.annotation.*;
/**
 * 登录拦截校验标签
 * */
@Target(value = {ElementType.TYPE,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface LoginAnno {
}
