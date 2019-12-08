package com.set.hashstudent;

import java.util.HashSet;
import java.util.Iterator;
//创建一个存储学生类对象的集合，存储学生对象，使用程序实现在
//控制台遍历该集合
//要求 学生对象的成员变量值相同，就认为是一个对象
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> hs = new HashSet<Student>();
        //创建学生对象
        Student s1 = new Student("张三丰",99);
        Student s2 = new Student("张无忌",29);
        Student s3 = new Student("郭靖",56);

        //添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        //不可重复性
        Student s4 = new Student("郭靖",56);
        //重写hashCode和equals方法
        hs.add(s4);
        //遍历
        //迭代器遍历
        Iterator<Student> it = hs.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        //增强for循环遍历
        for(Student s:hs){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
