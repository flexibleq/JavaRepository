package com.map.maptraverse1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map集合的遍历（方式一）
* 1.获取所有键的集合，用keySet（）实现
* 2.遍历键的集合，获取到每一个键，用增强for实现
* 3.根据键获取值，用get（）方法实现
*
* */
public class MapTraverse1 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();
        //添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

       /* //获取到所有键的集合
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个键
        //增强for循环
        for(String key:keySet){
            String value = map.get(key);
            System.out.println(key+","+value);
        }
*/
        //获取到所有键的集合
        Set<String> keySet = map.keySet();
        //遍历键的集合，获取到每一个键，通过键获取值
        for(String key:keySet){
            String value = map.get(key);
            System.out.println(key+","+value);
        }
    }
}
