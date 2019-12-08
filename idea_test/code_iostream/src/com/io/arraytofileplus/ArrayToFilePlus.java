package com.io.arraytofileplus;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
* 需求：把ArrayList集合中的学生数据写入到文本文件，要求：
* 每一个学生对象的数据作为文件中的一行数据
* 格式：学号，姓名，年龄，居住地
*
* 思路：
* 1.定义学生类
* 2.创建集合
* 3.创建学生对象
* 4.把学生对象添加到集合中
* 5.创建字符缓冲流对象
* 6.遍历集合，得到每一个对象
* 7.把学生对象的数据拼接成指定格式的字符串
* 8.调用字符缓冲输出流对象的方法写数据
* 9.释放资源
* */
public class ArrayToFilePlus {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("001","张三丰",99,"武当");
        Student s2 = new Student("002","张翠山",45,"武当");
        Student s3 = new Student("003","张无忌",27,"武当");

        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_iostream\\students.txt"));
        //遍历集合
        for(Student s :array){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            String ss = sb.toString();
            bw.write(ss);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
    }
}
