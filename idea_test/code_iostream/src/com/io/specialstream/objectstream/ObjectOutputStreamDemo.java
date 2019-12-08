package com.io.specialstream.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo{
    public static void main(String[] args) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("code_iostream\\oos.txt"));
        //创建学生对象
        Student s = new Student("张三丰",100);
        oos.writeObject(s);
    }

}
