
package com.rop;

import com.rop.event.RopEventListener;
import com.rop.security.InvokeTimesController;
import com.rop.session.SessionManager;
import org.springframework.context.ApplicationContext;
import org.springframework.format.support.FormattingConversionService;

import java.util.concurrent.ThreadPoolExecutor;


public interface ServiceRouter {

    /**
     * ROP框架的总入口，一般框架实现，开发者无需关注。
     *
     * @param request
     * @param response
     */
    void service(Object request, Object response);

    /**
     * 启动服务路由器
     */
    void startup();

    /**
     * 关闭服务路由器
     */
    void shutdown();

    /**
     * 获取{@link RopContext}
     *
     * @return
     */
    RopContext getRopContext();

    /**
     * 设置Spring的上下文
     *
     * @param applicationContext
     */
    void setApplicationContext(ApplicationContext applicationContext);

    /**
     * 注册拦截器
     *
     * @param interceptor
     */
    void addInterceptor(Interceptor interceptor);

    /**
     * 注册监听器
     *
     * @param listener
     */
    void addListener(RopEventListener listener);

    /**
     * 设置{@link com.rop.security.SecurityManager}
     *
     * @param securityManager
     */
    void setSecurityManager(com.rop.security.SecurityManager securityManager);

    /**
     * 注册
     *
     * @param threadPoolExecutor
     */
    void setThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor);

    /**
     * 设置是否需要进行签名校验
     *
     * @param signEnable
     */
    void setSignEnable(boolean signEnable);

    /**
     * 设置所有服务的通用过期时间，单位为秒
     *
     * @param serviceTimeoutSeconds
     */
    void setServiceTimeoutSeconds(int serviceTimeoutSeconds);

    /**
     * 设置扩展错误资源基名
     *
     * @param extErrorBasename
     */
    void setExtErrorBasename(String extErrorBasename);

    /**
     * 允许设置多个资源文件
     * @param extErrorBasenames
     */
    void setExtErrorBasenames(String[] extErrorBasenames);

    /**
     * 设置格式化类型转换器
     *
     * @param conversionService
     */
    void setFormattingConversionService(FormattingConversionService conversionService);

    /**
     * 添加会话管理器
     *
     * @param sessionManager
     */
    void setSessionManager(SessionManager sessionManager);

    /**
     * 设置服务调用限制管理器
     * @param invokeTimesController
     */
    void setInvokeTimesController(InvokeTimesController invokeTimesController);

    /**
     * 设置线程信息摆渡器
     * @param threadFerryClass
     */
    void setThreadFerryClass(Class<? extends ThreadFerry> threadFerryClass);
}

