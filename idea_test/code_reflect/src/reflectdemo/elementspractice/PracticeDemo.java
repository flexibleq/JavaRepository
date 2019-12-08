package reflectdemo.elementspractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
* 通过反射实现如下操作
* Student s = new Student();
* s.name = "林青霞";
* s.age = 30;
* s.address = "西安";
* System.out.println(s);
*
* */
public class PracticeDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("reflectdemo.elementspractice.Student");
        //获取无参构造创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //获取成员变量
        //s.name = "林青霞";
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"林青霞");

        //s.age = 30;
        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj,30);

        //s.address = "西安";
        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj,"西安");
        System.out.println(obj);

    }
}
