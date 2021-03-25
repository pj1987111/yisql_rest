package com.zhy.yisql.netty.annotation;

import java.lang.annotation.*;

/**
 * 路径变量注解
 * 
 * @author Leo
 * @date 2018/3/16
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PathVariable {
    
    String value() default "";

}
