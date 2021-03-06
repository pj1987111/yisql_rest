package com.zhy.yisql.netty.rest.convert;

/**
 * 双精度转换器
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 */
final class DoubleConverter implements Converter<Double> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public Double convert(Object source) {
        return Double.parseDouble(source.toString());
    }

}
