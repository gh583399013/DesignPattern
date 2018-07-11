package com.ft.test001;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mask
 * @date 2018/7/11 11:38
 * @desc
 */
public class PrinterProxy {
    private PrinterService printerService;

    public PrinterProxy(PrinterService printerService){
        this.printerService = printerService;
    }

    public PrinterService getProxyObj(){
        System.out.println(printerService.getClass());
        return (PrinterService)Proxy.newProxyInstance(PrinterService.class.getClassLoader(),
                new Class[]{PrinterService.class},new PrinterProxyHandler());
    }

    private class PrinterProxyHandler implements InvocationHandler{
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("启动打印机......");
            Object object = method.invoke(printerService, args);
            System.out.println("关闭打印机......");
            return object;
        }
    }
}
