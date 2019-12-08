package com.io.specialstream.properties.propertiesmehod;

import java.util.Properties;
import java.util.Set;

/*
* Properties作为集合的特有方法：
* Object setProperty(String key,String value):设置集合的键和值，都是String类型，底层调用Hashtable方法put
* String getProperty(String key):使用此属性列表中指定的键搜索属性
* Set<String> stringPropertyNames():从该属性列表中返回一个不可修改的键集
* 其中键及其对应的值是字符串
 * */
public class PropertiesMethodDemo {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        //添加元素
        prop.setProperty("张三丰","100");
        prop.setProperty("张翠山","45");
        prop.setProperty("张无忌","24");
        //遍历集合
        Set<String> names = prop.stringPropertyNames();
        for(String name:names){
            String value = prop.getProperty(name);
            System.out.println(name+","+value);
        }
    }
}
