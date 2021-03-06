package com.zhy.yisql.netty.rest.convert;

/**
 * 单精度转换器
 * 
 * @author hongyi.zhou
 * @date 2018/3/16
 */
final class FloatConverter implements Converter<Float> {

    /**
     * 类型转换
     * 
     * @param source
     * @return
     */
    @Override
    public Float convert(Object source) {
        return Float.parseFloat(source.toString());
    }

}
