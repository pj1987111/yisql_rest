package com.zhy.yisql.netty.rest.controller;

import com.zhy.yisql.netty.exception.ResourceNotFoundException;
import com.zhy.yisql.netty.rest.HttpContextHolder;
import com.zhy.yisql.netty.rest.HttpResponse;
import com.zhy.yisql.netty.rest.HttpStatus;

public class ExceptionController implements ExceptionHandler {

    /**
     * 处理异常
     * @param e
     */
    @Override
    public void doHandle(Exception e) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if(e instanceof ResourceNotFoundException) {
            status = HttpStatus.NOT_FOUND;
        }
        String errorMessage = e.getCause() == null ? "" : e.getCause().getMessage();
        if(errorMessage == null) {
            errorMessage = e.getMessage();
        }
        HttpResponse response = HttpContextHolder.getResponse();
        response.write(status, errorMessage);
        response.closeChannel();
    }

}
