package com.io.filetoarrayplus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 *需求：把文本文件的数据读取到集合中，并遍历集合，要求：
 * 文件中的每一行数据是一个学生对象的成员变量值
 *
 * 思路：
 * 1.定义学生类
 * 2.创建字符缓冲输入流对象
 * 3.创建集合
 * 4.读取字符串数据并用split分割成数组
 * 5.创建学生对象
 * 6.把数组中的元素拿来给学生对象赋值
 * 7.添加学生对象到集合
 * 8.释放资源
 * 9.遍历集合
 * */
public class FileToArrayPlus {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_iostream\\students.txt"));
        //创建集合
        ArrayList<Student> array = new ArrayList<Student>();
        //读取字符数据
        String line;
        while ((line = br.readLine()) != null) {
            String[] strArr = line.split(",");
            //创建学生对象
            Student s = new Student();
            //赋值
            s.setSid(strArr[0]);
            s.setName(strArr[1]);
            s.setAge(Integer.parseInt(strArr[2]));
            s.setAddress(strArr[3]);
            //添加元素
            array.add(s);
        }
        //释放资源
        br.close();
        //遍历集合
        for(Student s:array){
            System.out.println(s.getSid()+","+s.getName()+","+s.getAge()+","+s.getAddress());
        }
    }
}
