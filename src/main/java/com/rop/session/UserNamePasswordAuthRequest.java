package com.rop.session;


public class UserNamePasswordAuthRequest extends AbstractAuthRequest {

    private String userName;

    private String password;

    public UserNamePasswordAuthRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public Object getPrincipal() {
        return userName;
    }


    public Object getCredential() {
        return password;
    }
}
