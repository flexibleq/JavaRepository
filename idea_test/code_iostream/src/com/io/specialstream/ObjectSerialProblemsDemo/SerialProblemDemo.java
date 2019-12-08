package com.io.specialstream.ObjectSerialProblemsDemo;

import java.io.*;

/*
* 用对象序列化流序列化了一个对象后，若是修改了对象所属的类文件，读取数据会不会出问题
* java.io.InvalidClassException:
* 当序列化运行时检测到类中的以下问题之一时就抛出：
* 类的串行版本与从流中读取的类描述符的类型不匹配
* 该类包含未知的数据类型
* 该类没有可访问的无参构造函数
*
* 如果出问题了，如何解决呢
* 给对象所属的类加一个值：private static final long serialVersionUID = 42L;
*
* 如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢
* 为该属性添加transient关键字
* */
public class SerialProblemDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      //write();
      read();
    }

    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("code_iostream\\oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student)obj;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
    public static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("code_iostream\\oos.txt"));
        Student s = new Student("张三丰",100);
        oos.writeObject(s);
        oos.close();
    }
}
