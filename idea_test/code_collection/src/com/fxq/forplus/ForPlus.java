package com.fxq.forplus;

import java.util.ArrayList;
import java.util.List;
//增强for循环
//简化数组和Collection集合的遍历
//实现Iterable接口的类允许其对象成为增强型for语句的目标
//它是jdk5之后出现的，其内部原理是一个Iterator迭代器
//格式:
//for(元素数据类型 变量名：数组或者Collection集合){
//  //在此处使用变量即可，该变量即是元素
// }
public class ForPlus {
    public static void main(String[] args) {
        //创建一个数组
        int [] arr = {12,34,45,56,67,78};
        //增强for循环遍历
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println("--------------");
        //创建String 类型的数组
        String [] strArr = {"hello","world","java"};
        //增强for循环遍历
        for(String s:strArr){
            System.out.println(s);
        }
        System.out.println("--------------");
        //创建一个集合
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("----------------");
        //本质是一个Iterator迭代器,并发修改异常说明本质上确实是一个Iterator迭代器
        for(String s:list){//ConcurrentModificationException
            if(s.equals("hello")){
                list.add("javaee");
            }
        }
     }
}
