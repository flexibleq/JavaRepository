package com.io.arraytofileplus2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
* 需求：键盘录入5个学生信息，要求按照总分从高到低写入文本文件
* 格式：姓名，语文成绩，数学成绩，英语成绩
* 思路：
* 1.定义学生类
* 2.创建TreeSet集合，通过比较器排序
* 3.键盘录入学生数据
* 4.创建学生对象，把键盘录入的数据赋值给学生对象的属性
* 5.添加学生对象到集合
* 6.创建字符缓冲输出流对象
* 7.遍历集合
* 8.数据按指定格式拼接
* */
public class ArrayToFilie {
    public static void main(String[] args) throws IOException{
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();
                int num1 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num2 = num1 == 0 ? s1.getMath() - s2.getMath() : num1;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
                //return 0;
            }
        });
        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_iostream\\ts.txt"));
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("请输入数学成绩：");
            int math = sc.nextInt();
            System.out.println("请输入英语成绩：");
            int english = sc.nextInt();

            //赋值属性
            Student s = new Student(name,chinese,math,english);
            //添加元素到集合
            ts.add(s);
        }

        //遍历集合
        for(Student s:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();

    }
}
