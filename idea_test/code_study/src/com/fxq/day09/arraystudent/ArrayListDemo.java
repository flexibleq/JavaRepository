package com.fxq.day09.arraystudent;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("小蜜蜂",1);
        Student s2 = new Student("飞呀飞",3);
        Student s3 = new Student("飞不动",18);

        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
