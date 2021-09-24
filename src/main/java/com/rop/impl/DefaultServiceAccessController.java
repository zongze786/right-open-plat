
package com.rop.impl;

import com.rop.security.ServiceAccessController;
import com.rop.session.Session;


public class DefaultServiceAccessController implements ServiceAccessController {


    public boolean isAppGranted(String appKey, String method, String version) {
        return true;
    }


    public boolean isUserGranted(Session session, String method, String version) {
        return true;
    }
}

