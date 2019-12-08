package com.fxq.classcode.day15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectField {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("com.fxq.classcode.day15.Student");
        //获取构造方法
        Constructor<?> dcon = c.getDeclaredConstructor();
        //创建对象
        Object obj = dcon.newInstance();

        //获取成员变量-name
        Field nameField = c.getDeclaredField("name");
        //暴力反射
        nameField.setAccessible(true);
        nameField.set(obj,"张三丰");
        System.out.println(obj);

        //获取成员变量-age
        Field ageField = c.getDeclaredField("age");
        //暴力反射
        ageField.setAccessible(true);
        ageField.set(obj,108);
        System.out.println(obj);

        //获取成员变量-address
        Field addressField = c.getDeclaredField("address");
        //暴力反射
        addressField.setAccessible(true);
        addressField.set(obj,"武当");
        System.out.println(obj);
    }
}
