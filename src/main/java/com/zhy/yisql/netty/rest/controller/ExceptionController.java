package com.zhy.yisql.netty.rest.controller;

import com.zhy.yisql.netty.exception.ResourceNotFoundException;
import com.zhy.yisql.netty.rest.HttpContextHolder;
import com.zhy.yisql.netty.rest.HttpResponse;
import com.zhy.yisql.netty.rest.HttpStatus;

import java.io.PrintWriter;
import java.io.StringWriter;

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
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        String errorMessage = sw.toString();
        HttpResponse response = HttpContextHolder.getResponse();
        response.write(status, errorMessage);
        response.closeChannel();
    }

}
