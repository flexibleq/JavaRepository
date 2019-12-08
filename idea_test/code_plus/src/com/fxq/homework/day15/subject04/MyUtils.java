package com.fxq.homework.day15.subject04;

import java.lang.reflect.Field;

public class MyUtils {
    private MyUtils(){}

    public static Object getProperty(Object obj,String fieldName) throws NoSuchFieldException, IllegalAccessException {
        //获取Class对象
        Class<?> c = obj.getClass();
        //获取成员变量
        Field nameField = c.getDeclaredField(fieldName);
        nameField.setAccessible(true);
        Object o = nameField.get(obj);
        return o;
    }
}
