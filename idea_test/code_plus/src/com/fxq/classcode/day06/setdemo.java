package com.fxq.classcode.day06;

import java.util.HashSet;

public class setdemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> hs = new HashSet<Student>();
        //创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",33);
        Student s3 = new Student("王祖贤",35);

        Student s4 = new Student("王祖贤",35);


        //添加元素
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //遍历
        for(Student s:hs){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
