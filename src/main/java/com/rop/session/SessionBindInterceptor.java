
package com.rop.session;

import com.rop.AbstractInterceptor;
import com.rop.CommonConstant;
import com.rop.RopRequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SessionBindInterceptor extends AbstractInterceptor {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());


    public void beforeService(RopRequestContext ropRequestContext) {
        Session session = ropRequestContext.getSession();
        if (session != null) {
            RopSessionHolder.put(session);
            if (logger.isDebugEnabled()) {
                logger.debug("会话绑定到{}中", RopSessionHolder.class.getCanonicalName());
            }
        }
    }


    public void beforeResponse(RopRequestContext ropRequestContext) {
        Session session = ropRequestContext.getSession();
        if (session != null && session.isChanged()) {
            session.removeAttribute(CommonConstant.SESSION_CHANGED);
            SessionManager sessionManager = ropRequestContext.getRopContext().getSessionManager();
            sessionManager.addSession(ropRequestContext.getSessionId(), session);
            if (logger.isDebugEnabled()) {
                logger.debug("会话内容发生更改，将其同步到外部缓存管理器中。");
            }
        }
    }
}
