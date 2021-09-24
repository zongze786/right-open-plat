
package com.rop.session;


public class RopSessionHolder {

    private static  ThreadLocal<Session> ropSession = new ThreadLocal<Session>();

    public static  void put(Session session){
        ropSession.set(session);
    }
    public static Session get(){
        return ropSession.get();
    }

    public static <T> T get(Class<T> sessionClazz){
        return (T)ropSession.get();
    }
}
