package com.zhy.yisql.netty.rest.convert;

/**
 * 数据转换器接口
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 *
 * @param <S>
 * @param <T>
 */
public interface Converter<T> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    T convert(Object source);

}
