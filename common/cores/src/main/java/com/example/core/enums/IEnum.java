package com.example.core.enums;

import com.fasterxml.jackson.annotation.JacksonAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 用于实体类字段返回对应的value
* */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//@Documented
@JacksonAnnotation
public @interface IEnum {
    String name() default "";//字段需要返回对应value的名称
    Class<?> value();//字段对应枚举实体
}
