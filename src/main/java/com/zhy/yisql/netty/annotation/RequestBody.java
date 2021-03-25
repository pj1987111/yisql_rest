package com.zhy.yisql.netty.annotation;

import java.lang.annotation.*;

/**
 * Request 请求体注解
 * 
 * @author Leo
 * @date 2018/3/16
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestBody {
    
    String value() default "";

}
