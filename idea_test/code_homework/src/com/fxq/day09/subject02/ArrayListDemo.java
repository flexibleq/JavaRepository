package com.fxq.day09.subject02;

import java.util.ArrayList;

//1.创建一个ArrayList集合，用于存储一些字符串："abc","def","def","ghi","def","hij","jkol"
//	2.遍历集合，统计集合中"def"字符串一共出现了多少个
//	3.将集合中的所有"def"字符串删除。打印删除后的集合元素
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个ArrayList集合，用于存储一些字符串
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("abc");
        array.add("def");
        array.add("def");
        array.add("ghi");
        array.add("def");
        array.add("hij");
        array.add("jkol");
        //定义一个计数器
        int count = 0;
        //遍历集合，统计集合中"def"字符串一共出现了多少个
        //将集合中的所有"def"字符串删除。打印删除后的集合元素
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            if(s.equals("def")){
                count++;
                array.remove(s);
                i--;
            }

        }
        System.out.println("def一共出现了"+count+"次");

        //将集合中的所有"def"字符串删除。打印删除后的集合元素
       /* for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            if(s.equals("def")){
                array.remove(s);
                i--;
            }
        }*/
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
//        System.out.println(array);
    }
}
