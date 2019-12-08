package com.fxq.studentarray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("张三丰",99);
        Student s2 = new Student("张无忌",29);
        Student s3 = new Student("杨过",29);
        //添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合
        //迭代器方式
        Iterator<Student> it = array.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("-------------------");
        //for循环方式
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("-------------------");
        //增强for循环方式
        for(Student s:array){
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("-------------------");

        //创建LinkedList对象
        LinkedList<Student> linkedlist = new LinkedList<Student>();
        //创建学生对象
        Student s4 = new Student("郭靖",45);
        Student s5 = new Student("洪七公",70);
        Student s6 = new Student("欧阳锋",67);
        //添加到集合中
        linkedlist.add(s4);
        linkedlist.add(s5);
        linkedlist.add(s6);

        //遍历集合
        //迭代器方式
        Iterator<Student> lit = linkedlist.iterator();
        while(lit.hasNext()){
            Student s = lit.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("-------------------");

        //for循环方式
        for(int i=0;i<linkedlist.size();i++){
            Student s = linkedlist.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("-------------------");

        //增强for循环
        for(Student s:linkedlist){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
