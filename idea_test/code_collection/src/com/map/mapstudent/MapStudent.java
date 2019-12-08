package com.map.mapstudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 需求：创建一个HashMap集合，键是学号(String)，值是学生对象(Student)
* 存储三个键值对对象并遍历
* 思路
*1.定义学生类
* 2.创建HashMap集合对象
* 3.创建学生对象
* 4.把学生添加到集合
* 5.遍历集合
*   方式一：键找值
*   方式二：键值对对象找键和值
* */
public class MapStudent {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String,Student> hm = new HashMap<String,Student>();
        //创建学生对象
        Student s1 = new Student("张三丰","001",99);
        Student s2 = new Student("王重阳","002",78);
        Student s3 = new Student("杨过","003",45);
        //添加元素
        hm.put("001",s1);
        hm.put("002",s2);
        hm.put("003",s3);

        //遍历集合
       /* //方式一
       //获取所有键的集合
        Set<String> keySet = map.keySet();
        //遍历
        //遍历集合获取到每一个键，通过键获取到值
        for(String key:keySet){
            Student s = map.get(key);
            System.out.println(key+","+s.getName()+","+s.getId()+","+s.getAge());
        }*/

       //方式二
        //获取所有键值对对象集合
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        //遍历集合，获取到每一个键值对对象，通过键值对对象获取键和值
        for(Map.Entry<String,Student> me:entrySet){
            String key = me.getKey();
            Student s = me.getValue();
            System.out.println(key+","+s.getName()+","+s.getId()+","+s.getAge());
        }
    }

}
