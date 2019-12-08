package com.fxq.classcode.day15;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectPropeties {
    public static void main(String[] args) throws Exception {
        //创建Properties对象
        Properties prop = new Properties();
        prop.load(ReflectPropeties.class.getClassLoader().getResourceAsStream("class.txt"));
        //获取集合内容
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");
        //获取Class对象
        Class<?> cls = Class.forName(className);
        //获取构造方法
        Constructor<?> dcon = cls.getDeclaredConstructor();
        //创建对象
        Object obj = dcon.newInstance();
        //获取成员方法
        Method dm = cls.getDeclaredMethod(methodName);
        //执行成员方法
        dm.invoke(obj);
    }
}
