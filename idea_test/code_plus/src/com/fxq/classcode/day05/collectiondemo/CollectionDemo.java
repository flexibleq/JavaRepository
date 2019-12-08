package com.fxq.classcode.day05.collectiondemo;


import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("张三丰",100);
        Student s2 = new Student("张翠山",40);
        Student s3 = new Student("张无忌",20);
        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合
        //获取迭代器
        Iterator<Student> it = array.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
            /*System.out.println("-------------");
            System.out.println(s);*/
        }
    }
}
