package reflectdemo.privateconstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrivateConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("reflectdemo.privateconstructor.Student");
        //获取构造方法
        Constructor<?> dcon = c.getDeclaredConstructor(String.class);
        //暴力反射
        //void setAccessible​(boolean flag) 将此反射对象的 accessible标志设置为指示的布尔值。
        dcon.setAccessible(true);
        //通过构造方法获取对象
        Object obj = dcon.newInstance("张三丰");
        System.out.println(obj);//IllegalAccessException   因为该构造方法被private修饰
    }
}
