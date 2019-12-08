package reflectdemo.getmethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* Class类中用于获取成员方法的方法
* Method[] getMethods():返回所有公共成员方法对象的数组，包括继承的
* Method[] getDeclaredMethods():返回所有成员方法对象的数组，不包括继承的
* Method getMethod(String name,Class<?>...parameterTypes):返回单个公共成员方法对象
* Method getDeclaredMethod(String name,Class<?>...parameterTypes):返回单个成员方法对象
*
* Method类中用于调用成员方法的方法
* Object invoke(Object obj,Object...args):调用obj对象的成员方法，
* 参数是args，返回值是Object类型
* */
public class GetMethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("reflectdemo.getmethod.Student");
        //获取无参构造创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //Method[] getMethods():返回所有公共成员方法对象的数组，包括继承的
       /* Method[] methods = c.getMethods();
        for(Method m:methods){
            System.out.println(m);
        }*/
       //Method[] getDeclaredMethods():返回所有成员方法对象的数组，不包括继承的
       /* Method[] dms = c.getDeclaredMethods();
        for(Method m :dms){
            System.out.println(m);
        }*/
       
       //Method getMethod(String name,Class<?>...parameterTypes):返回单个公共成员方法对象
        /*Method m = c.getMethod("method1");
        m.invoke(obj);*/

        //Method getDeclaredMethod(String name,Class<?>...parameterTypes):返回单个成员方法对象
       /* Method m = c.getDeclaredMethod("method1");
        m.invoke(obj);*/

    }
}
