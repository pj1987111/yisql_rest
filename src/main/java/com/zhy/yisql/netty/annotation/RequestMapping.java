package com.zhy.yisql.netty.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Http 请求映射类
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface RequestMapping {

    String value() default "";

}
