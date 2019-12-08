package com.map.mapdemo;

import java.util.HashMap;
import java.util.Map;

//Map集合概述：
//Interface Map<K,V> K:键的类型 V:值的类型
//将键映射到值的对象，不能包含重复的键，每个键可以映射到最多一个值
//举例：学生的学号和姓名
//001      张三丰
//002      王重阳
//003      李白
//创建Map集合的方式
//多态的方式
//具体的实现类：HashMap
public class MapDemo {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();
        //V put(K key,V value)将指定的值与该映射中的指定键相关联
        map.put("it001","张三丰");
        map.put("it002","王重阳");
        map.put("it003","李白");
        //put既可以作为添加元素的方法，如果指定键已存在
        //就会将之前对应的值覆盖掉
        map.put("it003","杜甫");
        //输出集合对象
        System.out.println(map);
    }
}
