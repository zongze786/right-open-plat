
package com.rop.security;

import com.rop.RopRequestContext;
import com.rop.session.SessionManager;


public interface SecurityManager {

    /**
     * 对请求服务的上下文进行检查校验
     *
     * @param ropRequestContext
     * @return
     */
    MainError validateSystemParameters(RopRequestContext ropRequestContext);

    /**
     * 验证其它的事项：包括业务参数，业务安全性，会话安全等
     *
     * @param ropRequestContext
     * @return
     */
    MainError validateOther(RopRequestContext ropRequestContext);

    /**
     * 获取安全管理器
     *
     * @return
     */
    void setServiceAccessController(ServiceAccessController serviceAccessController);

    /**
     * 获取应用密钥管理器
     *
     * @return
     */
    void setAppSecretManager(AppSecretManager appSecretManager);

    /**
     * 设置会话管理器，以验证会话的合法性
     *
     * @return
     */
    void setSessionManager(SessionManager sessionManager);


    /**
     * 设置服务调度次数管理器
     * @param invokeTimesController
     */
    void setInvokeTimesController(InvokeTimesController invokeTimesController);

    /**
     * 文件上传控制器
     * @param fileUploadController
     */
    void setFileUploadController(FileUploadController fileUploadController);
}

