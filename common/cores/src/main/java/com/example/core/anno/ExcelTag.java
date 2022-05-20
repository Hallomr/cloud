package com.example.core.anno;

import org.apache.poi.ss.usermodel.IndexedColors;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelTag {
    /**
     * 表头
     *
     */
    String tag();
    /**
     * 字体颜色
     *
     */
    IndexedColors fontColor() default IndexedColors.BLACK;
}