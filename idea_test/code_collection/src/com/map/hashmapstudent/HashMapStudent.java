package com.map.hashmapstudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 需求：创建一个HashMap集合，键是学生对象(Student)，值是居住地(String)，存储多个键值对元素，并遍历
* 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个元素
* 思路：
* 1.定义学生类
* 2.创建HashMap集合对象
* 3.创建学生对象
* 4.把学生添加到集合
* 5.遍历集合
* 6.在学生类中重写两个方法：
* hashCode()
* equals()
* */
public class HashMapStudent {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student,String> hm = new HashMap<Student,String>();
        //创建学生对象
        Student s1 = new Student("张三丰",99);
        Student s2 = new Student("王重阳",78);
        Student s3 = new Student("李白",57);
        Student s4 = new Student("李白",57);//重写hashCode()方法和equals()方法，确保元素唯一性

        //添加元素
        hm.put(s1,"武当");
        hm.put(s2,"全真");
        hm.put(s3,"长安");
        hm.put(s4,"洛阳");
        //遍历集合
        //方式一
        //获取所有键的集合
        Set<Student> keySet = hm.keySet();
        //遍历集合，获取到每一个键，通过键获取值
        for(Student s:keySet){
            String value = hm.get(s);
            System.out.println(s.getName()+","+s.getAge()+","+value);
        }
        System.out.println("-------------");

        //方式二
        // 获取所有键值对对象
        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        //遍历集合，获取到每一个键值对对象，获取到键和值
        for(Map.Entry<Student,String> me:entrySet){
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+","+key.getAge()+","+value);
        }

    }
}
