package com.fxq.classcode.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取student的Class对象
        Class<?> c = Class.forName("com.fxq.classcode.day15.Student");
        //获取构造方法
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //通过构造方法创建对象
        Object obj = con.newInstance("张三丰", 108, "武当");
        System.out.println(obj);

        //获取私有构造方法
        Constructor<?> dcon = c.getDeclaredConstructor(String.class);
        //暴力反射
        dcon.setAccessible(true);
        //通过私有构造方法创建对象
        Object obj1 = dcon.newInstance("张无忌");
        System.out.println(obj1);
    }
}
