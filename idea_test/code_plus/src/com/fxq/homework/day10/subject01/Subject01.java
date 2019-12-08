package com.fxq.homework.day10.subject01;

import java.io.*;
import java.util.ArrayList;

//分析以下需求，并用代码实现
//	1.定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,
//	生成空参有参构造,set和get方法,toString方法
//	2.创建4个学生对象,将4个学生对象存入到ArrayList集合中
//	3.将存有4个学生对象的ArrayList集合对象写入到D:\\StudentInfo.txt文件中
//	4.读取D:\\StudentInfo.txt文件中的ArrayList对象并遍历打印
//	5.要求使用序列化流来实现
//
public class Subject01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建学生对象
        Student s1 = new Student("张三丰","男",100);
        Student s2 = new Student("黄蓉","女",30);
        Student s3 = new Student("张翠山","男",45);
        Student s4 = new Student("张无忌","男",24);
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        //创建对象序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\studentInfo.txt"));
        oos.writeObject(array);
        oos.flush();

        //创建对象反序列化流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\studentInfo.txt"));
        Object obj = ois.readObject();
        ArrayList<Student> list = (ArrayList<Student>) obj;
        //遍历集合
        for(Student s:list){
            System.out.println(s.getName()+","+s.getGender()+","+s.getAge());
        }
        oos.close();
        ois.close();
    }
}
