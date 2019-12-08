package com.fxq.classcode.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.fxq.classcode.day15.Student");
        //获取构造方法
        Constructor<?> con = c.getConstructor();
        //创建对象
        Object obj = con.newInstance();

        //获取成员方法-function
        Method f = c.getDeclaredMethod("function");
        f.setAccessible(true);
        f.invoke(obj);
        //获取成员方法-method1
        Method m1 = c.getDeclaredMethod("method1");
        m1.setAccessible(true);
        m1.invoke(obj);
        //获取成员方法-method2
        Method m = c.getDeclaredMethod("method2", String.class);
        //暴力反射
        m.setAccessible(true);
        //执行方法
        m.invoke(obj,"helloworld");
        //获取成员方法-method3
        Method m3 = c.getDeclaredMethod("method3", String.class, int.class);
        m3.setAccessible(true);
        Object result = m3.invoke(obj, "hello", 45);
        System.out.println(result);
    }
}
