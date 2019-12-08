package reflectdemo.constructorpracticedemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("reflectdemo.constructorpracticedemo.Student");
        //获取构造方法
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        //通过newInstance创建对象
        Object o = con.newInstance("张三丰",99,"武当");
        System.out.println(o);
    }
}
