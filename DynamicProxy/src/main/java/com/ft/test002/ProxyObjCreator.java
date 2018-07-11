package com.ft.test002;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mask
 * @date 2018/7/11 14:52
 * @desc
 */
public class ProxyObjCreator {

    private Object targetObj;

    public <T> T getBean(Class<T> clazz){
        InvocationHandler invocationHandler = new CommonHandler();
        return (T)Proxy.newProxyInstance(clazz.getClassLoader(),new Class[]{clazz}, invocationHandler);
    }

    public class CommonHandler implements InvocationHandler{
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("打开conn连接...");
            if(targetObj != null){
                method.invoke(targetObj, args);
            }
            System.out.println("关闭conn连接...");
            return null;
        }
    }

    public Object getTargetObj() {
        return targetObj;
    }

    public void setTargetObj(Object targetObj) {
        this.targetObj = targetObj;
    }
}
