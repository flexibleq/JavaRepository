package reflectdemo.constructordemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
* Constructor<?>[] getContructors():返回所有公共构造方法对象的数组
* Constructor<?>[] getDeclaredConstructors():返回所有构造方法对象的数组
* Constructor<T> getConstructor(Class<?> ...parameterTypes):返回单个公共构造方法对象
* Constructor<T> getDeclaredConstructor(Class<?> ...parameterTypres):返回单个构造方法对象
* 参数：你要获取的构造方法的参数的个数和数据类型对应的字节码文件对象
* */
public class ConstructorDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("reflectdemo.constructordemo.Student");
        //Constructor<?>[] getContructors():返回所有公共构造方法对象的数组
        Constructor<?>[] cons = c.getConstructors();
        for(Constructor con :cons){
            System.out.println(con);
            //public reflectdemo.constructordemo.Student(java.lang.String,int,java.lang.String)
            //public reflectdemo.constructordemo.Student()
        }

        //Constructor<?>[] getDeclaredConstructors():返回所有构造方法对象的数组
        Constructor<?>[] dcons = c.getDeclaredConstructors();
        for(Constructor con : dcons){
            System.out.println(con);
            //public reflectdemo.constructordemo.Student(java.lang.String,int,java.lang.String)
            //private reflectdemo.constructordemo.Student(java.lang.String)
            //reflectdemo.constructordemo.Student(java.lang.String,int)
            //public reflectdemo.constructordemo.Student()
        }

        //Constructor<T> getConstructor(Class<?> ...parameterTypes):返回单个公共构造方法对象
        Constructor<?> con = c.getConstructor();
        //Constructor提供了一个类的单个构造函数的信息和访问权限
        //T newInstance(Object...initargs)使用由此Constructor对象表示的构造函数，使用指定的初始化参数来创建和
        //初始化构造函数的声明类的新实例
        Object obj = con.newInstance();
        System.out.println(obj);//Student{name='null', age=0, address='null'}

        Object o = con.newInstance();
        System.out.println(o);

    }
}
