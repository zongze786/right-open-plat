package com.rop.session;



public abstract class AbstractAuthenticationManager implements AuthenticationManager {

    private String[] appKeys = null;

    private boolean _default = false;


    public String[] appkeys() {
        return appKeys;
    }


    public boolean isDefault() {
        return _default;
    }

    public void setAppKeys(String[] appKeys) {
        this.appKeys = appKeys;
    }

    public void setDefault(boolean _default) {
        this._default = _default;
    }
}
