package com.fxq.homework.day07.subject01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//(1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
//	(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
//	(3)利用两种方式遍历Map集合中的内容，格式：key:value
public class MapDemo {
    public static void main(String[] args) {
        //定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
        Map<Student,String> map = new HashMap<Student,String>();
        //创建学生对象
        Student s1 = new Student("张三丰",99);
        Student s2 = new Student("王重阳",67);
        Student s3 = new Student("郭靖",45);
        //添加元素
        map.put(s1,"武当");
        map.put(s2,"全真");
        map.put(s3,"桃花岛");

        //遍历
        //方式一
        //获取所有键的集合
        Set<Student> keySet = map.keySet();
        //遍历集合，获取到每一个键，通过键获取值
        for(Student key:keySet){
            String value = map.get(key);
            System.out.println(key.getName()+","+key.getAge()+":"+value);
        }

        //方式二
        //获取所有键值对对象
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        //遍历集合，获取到每一个键值对，获取键和值
        for(Map.Entry<Student,String> me:entrySet){
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+","+key.getAge()+":"+value);
        }
    }
}
