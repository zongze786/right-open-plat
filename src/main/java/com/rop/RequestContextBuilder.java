
package com.rop;


public interface RequestContextBuilder {
    /**
     * 根据reqeuest及response请求响应对象，创建{@link RopRequestContext}实例。绑定系统参数，请求对象
     * @param ropContext
     * @param request
     * @param response
     * @return
     */
    RopRequestContext buildBySysParams(RopContext ropContext, Object request,Object response);

    /**
     * 绑定业务参数
     *
     * @param ropRequestContext
     */
    RopRequest buildRopRequest(RopRequestContext ropRequestContext);
}

