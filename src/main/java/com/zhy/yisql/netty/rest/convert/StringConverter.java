package com.zhy.yisql.netty.rest.convert;

/**
 * 字符串转换器
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 */
final class StringConverter implements Converter<String> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public String convert(Object source) {
        return source.toString();
    }

}
