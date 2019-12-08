package com.fxq.classcode.day10;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("code_plus\\oosoo.txt"));
        //创建对象
        Teacher t = new Teacher("张三丰",109);
        oos.writeObject(t);
        //释放资源
        oos.close();

        //创建对象反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("code_plus\\oosoo.txt"));
        Object obj = ois.readObject();
        //向下转型
        Teacher tt = (Teacher)obj;
        System.out.println(tt.getName()+","+tt.getAge());
        ois.close();
    }
}
