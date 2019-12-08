package reflectdemo.methodpractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* Student s = new Student();
* s.method1();
* s.method2("林青霞");
* String ss = s.method3("林青霞",30);
* System.out.println(ss);
* s.function();
* */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("reflectdemo.methodpractice.Student");
        //获取无参构造创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //获取成员方法
        //s.method1();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        //s.method2("林青霞");
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj,"林青霞");

        //String ss = s.method3("林青霞",30);
        //* System.out.println(ss);
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 30);
        System.out.println(o);

        //s.function();
        //Method f = c.getMethod("function");//NoSuchMethodException  该方法被private修饰
        Method f = c.getDeclaredMethod("function");
        //暴力反射
        f.setAccessible(true);
        f.invoke(obj);
    }
}
