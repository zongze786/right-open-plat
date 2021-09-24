package com.rop.session;


public abstract class AbstractAuthRequest implements AuthRequest {

    private Object detail;


    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

}
