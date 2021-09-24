package com.rop.session;

import java.util.HashMap;
import java.util.Map;


public class AuthResponse {

    private Session ropSession;

    private boolean authenticated = false;

    private String errorCode;

    public Session getRopSession() {
        return ropSession;
    }

    public void setRopSession(Session logonSession) {
        this.ropSession = logonSession;
        this.authenticated = true;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
