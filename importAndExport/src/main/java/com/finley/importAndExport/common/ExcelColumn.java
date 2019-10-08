package com.finley.importAndExport.common;

import java.lang.annotation.*;

/**
 * @ClassName ExcelColum
 * @Description TODO
 * @Auth Finley
 * @Date 2019/09/29 16:29
 * @Version 1.0
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {

    String value() default "";

    int col() default 0;
}
