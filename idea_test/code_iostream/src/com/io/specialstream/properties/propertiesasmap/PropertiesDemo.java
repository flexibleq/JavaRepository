package com.io.specialstream.properties.propertiesasmap;

import java.util.Properties;
import java.util.Set;

/*
* Properties作为Map集合的使用
* */
public class PropertiesDemo {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        //添加元素
        prop.put("张三丰",100);
        prop.put("张翠山",45);
        prop.put("张无忌",24);
        //遍历集合
        Set<Object> keySet = prop.keySet();
        for(Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
