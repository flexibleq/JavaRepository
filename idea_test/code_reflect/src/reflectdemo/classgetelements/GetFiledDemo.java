package reflectdemo.classgetelements;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//反射获取成员变量并使用
/*
* Field[] getFields():返回所有公共成员变量对象的数组
* Field[] getDeclaredFields():返回所有成员变量对象的数组
* Field getField(String name):返回单个公共成员变量对象
* Field getDeclaredField(String name):返回单个成员变量对象
* 
* Field类中用于给成员变量赋值的方法
* void set(Object obj,Object value):给obj对象的成员变量赋值为value
* */
public class GetFiledDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("reflectdemo.classgetelements.Student");
        //获取成员变量
        Field[] fields = c.getFields();
        for(Field f:fields){
            System.out.println(f);
        }

        Field[] dfields = c.getDeclaredFields();
        for(Field f:dfields){
            System.out.println(f);
        }

        //获取单个公共的成员变量
        Field addressField = c.getField("address");
        //Field类提供有关类或接口的单个字段的信息和动态访问
        //获取构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //void set(Object obj,Object value):给obj对象的成员变量赋值为value
        addressField.set(obj,"长安");
        System.out.println(obj);
    }
}
