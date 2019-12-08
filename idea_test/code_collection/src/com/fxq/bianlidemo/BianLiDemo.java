package com.fxq.bianlidemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BianLiDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student s = new Student("王涌",21);
        Student s1 = new Student("吕俊豪",22);
        Student s2 = new Student("张翩笙",21);

        //添加到集合中
        list.add(s);
        list.add(s1);
        list.add(s2);

        //三种遍历方式
        //迭代器遍历
        //获取迭代器对象
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student ss = it.next();
            System.out.println(ss.getName()+","+ss.getAge());

        }
        System.out.println("-----------------");
        //for循环遍历
        for(int i=0;i<list.size();i++){
            Student sss = list.get(i);
            System.out.println(sss.getName()+","+sss.getAge());
        }
        System.out.println("-----------------");
        //增强for循环遍历
        for(Student ssss: list){
            System.out.println(ssss.getName()+","+ssss.getAge());
        }


    }
}
