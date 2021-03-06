package com.zhy.yisql.netty.rest.mapping;

import java.lang.reflect.Method;

/**
 * 请求映射注册策略接口
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 */
public interface RequestMappingRegisterStrategy {
    
    /**
     * 注册请求映射
     * @param clazz
     * @param baseUrl
     * @param method
     */
    void register(Class<?> clazz, String baseUrl, Method method);

}
