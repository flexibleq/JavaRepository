package com.fxq.studentlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1.创建学生类
 * 2.创建集合对象
 * 3.创建学生对象
 * 4.把学生添加到集合
 * 5.遍历集合（迭代器方式，for循环方式）
 */
public class ListDemo {
    public static void main(String[] args) {
       //创建集合对象
        List<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("张三丰",99);
        Student s2 = new Student("张无忌",28);
        Student s3 = new Student("王重阳",78);

        //添加学生到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        //迭代器方式
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student ss = it.next();
            System.out.println(ss.getName()+","+ss.getAge());
        }

        //for循环方式
        for (int i=0;i<list.size();i++){
            Student sss = list.get(i);
            System.out.println(sss.getName()+","+sss.getAge());

        }
    }
}
