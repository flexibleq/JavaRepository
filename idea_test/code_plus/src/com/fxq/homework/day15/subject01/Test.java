package com.fxq.homework.day15.subject01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

//1.定义一个Person类
//	2.定义 姓名 和 年龄 两个成员变量,生成构造方法和对应的set get方法
//	3.在该类中定义一个run()方法,打印:"我"+name+"是一个好人"
//	4.在该类中定义一个show(Date date)方法,该方法执行时可以将时间转为符合我们阅读习惯的格式
//		如:2019年01月08日 11:00:30
// 5.在该类中定义一个copy(String fileName)方法,该方法可以接收一个文件的名称
//		注意:在模块的根路径下已知有一个纯文本文档类型的文件,需要在该方法的内部
//		将文件里的内容反转
//		例如:
//			源文件内容:
//				种一颗树最好的时光是十年前
//				其次好的时光就是现在
//
//			方法执行之后文件里的内容
//				其次好的时光就是现在
//				种一颗树最好的时光是十年前
//
//	6.在测试类中,通过反射的方式创建对象、获取方法、执行方法
//

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("com.fxq.homework.day15.subject01.Person");
        //获取无参构造创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //获取成员变量
        Field nameField = c.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(obj,"张三丰");

        //获取成员方法
        Method m = c.getMethod("run");
        m.invoke(obj);

        Method s = c.getMethod("show", Date.class);
        s.invoke(obj,new Date());

        Method cc = c.getMethod("copy", String.class);
        cc.invoke(obj,"code_plus\\day15.txt");

    }
}
