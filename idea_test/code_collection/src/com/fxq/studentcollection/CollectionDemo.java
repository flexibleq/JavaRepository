package com.fxq.studentcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection<Student> c = new ArrayList<Student>();
        //创建学生类对象
        Student s1 = new Student("杨过",32);
        Student s2 = new Student("郭靖",45);
        Student s3 = new Student("欧阳锋",56);
        //把学生对象添加到集合中
        c.add(s1);
        c.add(s2);
        c.add(s3);
        //通过while循环和迭代器遍历集合
        //通过集合对象获取迭代器对象
        Iterator<Student> it = c.iterator();
        //遍历集合
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());

        }


    }
}
