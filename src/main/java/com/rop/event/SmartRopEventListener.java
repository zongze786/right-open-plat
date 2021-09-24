
package com.rop.event;


public interface SmartRopEventListener extends RopEventListener<RopEvent> {

    /**
     * 是否支持此事件
     *
     * @param eventType
     * @return
     */
    boolean supportsEventType(Class<? extends RopEvent> eventType);
}

