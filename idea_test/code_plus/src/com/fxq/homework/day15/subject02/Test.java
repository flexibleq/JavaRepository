package com.fxq.homework.day15.subject02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//已知一个类，定义如下：
//		package com.itheima;
//		public class DemoClass {
//			private void run(String name) {
////				System.out.println(nam + "welcome to heima!");
////			}
////		}
//		(1)写一个Properties格式的配置文件，配置类的完整名称、方法名称
//		(2)写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
//		(3)用反射 的方式创建对象、获取方法、执行方法
//
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建Properties对象
        Properties prop = new Properties();
        //创建字符流对象
        FileReader fr = new FileReader("code_plus\\day15.properties");

        prop.load(fr);

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //获取Class对象
        Class<?> c = Class.forName(className);
        //获取无参构造创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //获取成员方法
        //Method m = c.getMethod(methodName,String.class);
        Method m = c.getDeclaredMethod(methodName, String.class);
        //暴力反射
        m.setAccessible(true);
        m.invoke(obj,"张三丰");

    }


}
