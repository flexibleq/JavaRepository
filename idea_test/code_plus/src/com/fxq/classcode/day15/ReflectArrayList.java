package com.fxq.classcode.day15;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectArrayList {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建ArrayList集合
        ArrayList<Integer> array = new ArrayList<Integer>();
        //添加元素
        array.add(10);
        array.add(20);
        //获取Class对象
        Class<? extends ArrayList> cls = array.getClass();
        //获取add方法
        Method addMethod = cls.getDeclaredMethod("add", Object.class);
        //暴力反射
        addMethod.setAccessible(true);
        //执行add方法
        addMethod.invoke(array,"hello");
        addMethod.invoke(array,"world");
        System.out.println(array);
    }
}
