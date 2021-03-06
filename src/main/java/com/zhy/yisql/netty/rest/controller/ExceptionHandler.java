package com.zhy.yisql.netty.rest.controller;

/**
 * 异常处理器
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 */
public interface ExceptionHandler {

    /**
     * 处理异常
     * @param e
     */
    void doHandle(Exception e);
    
}
