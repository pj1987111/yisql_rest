package com.zhy.yisql.netty.annotation;

import java.lang.annotation.*;

/**
 * Http 请求参数注解
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    
    String value() default "";
    
    boolean required() default true;

}
