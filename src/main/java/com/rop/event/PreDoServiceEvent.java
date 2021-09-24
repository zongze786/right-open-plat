
package com.rop.event;

import com.rop.RopRequestContext;


public class PreDoServiceEvent extends RopEvent {

    private RopRequestContext ropRequestContext;

    public PreDoServiceEvent(Object source, RopRequestContext ropRequestContext) {
        super(source, ropRequestContext.getRopContext());
        this.ropRequestContext = ropRequestContext;
    }

    public RopRequestContext getRopRequestContext() {
        return ropRequestContext;
    }

    public long getServiceBeginTime() {
        return ropRequestContext.getServiceBeginTime();
    }
}

