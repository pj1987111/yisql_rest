package com.zhy.yisql;

import com.zhy.yisql.netty.core.WebServer;
import com.zhy.yisql.netty.rest.controller.ExceptionController;
import com.zhy.yisql.netty.rest.interceptor.CorsInterceptor;

/**
 *  \* Created with IntelliJ IDEA.
 *  \* User: hongyi.zhou
 *  \* Date: 2021-02-17
 *  \* Time: 23:53
 *  \* Description: 
 * todo
 * controller支持对象作为参数
 * form方式支持
 * 不存在url报错
 *  \
 */
public class Application {
    public static void main(String[] args) {
        int port = 2003;
        // 全局异常处理
        WebServer.setExceptionHandler(new ExceptionController());

        // 设置监听端口号
        WebServer server = new WebServer(port);

        // 设置Http最大内容长度（默认 为10M）
        server.setMaxContentLength(1024 * 1024 * 50);

        // 设置Controller所在包
        server.setControllerBasePackage("com.zhy.yisql.controller");

        // 添加拦截器，按照添加的顺序执行。
        // 跨域拦截器
        server.addInterceptor(new CorsInterceptor(), "/不用拦截的url");

        try {
            server.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
