
package com.rop.security;

import com.rop.session.Session;


public class DefaultInvokeTimesController implements InvokeTimesController {


    public void caculateInvokeTimes(String appKey, Session session) {
    }


    public boolean isUserInvokeLimitExceed(String appKey, Session session) {
        return false;
    }


    public boolean isSessionInvokeLimitExceed(String appKey, String sessionId) {
        return false;
    }


    public boolean isAppInvokeLimitExceed(String appKey) {
        return false;
    }


    public boolean isAppInvokeFrequencyExceed(String appKey) {
        return false;
    }
}

