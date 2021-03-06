
package com.rop.client;


public interface RopUnmarshaller {

    /**
     * 将字符串反序列化为相应的对象
     *
     * @param inputStream
     * @param objectType
     * @param <T>
     * @return
     */
    <T> T unmarshaller(String content, Class<T> objectType);
}

