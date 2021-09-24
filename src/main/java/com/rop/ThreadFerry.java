
package com.rop;


public interface ThreadFerry {

    /**
     * 在源线程中执行
     * @param
     */
    void doInSrcThread();

    /**
     * 在目标线程中执行
     */
    void doInDestThread();
}

