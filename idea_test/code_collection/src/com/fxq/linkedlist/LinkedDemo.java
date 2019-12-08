package com.fxq.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历输出字符串
        //迭代器方式
        Iterator<String> it = array.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");
        //for循环方式
        for(int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("-----------------");
        //增强for循环
        for(String s:array){
            System.out.println(s);
        }
        System.out.println("-----------------");

        //创建linkedlist对象
        LinkedList<String> linkedlist = new LinkedList<String>();
        //添加元素
        linkedlist.add("hello");
        linkedlist.add("world");
        linkedlist.add("java");

        //遍历集合
        //迭代器方式
        Iterator<String> itLink = linkedlist.iterator();
        while(itLink.hasNext()){
            String s = itLink.next();
            System.out.println(s);
        }
        System.out.println("-----------------");
        //for循环方式
        for(int i=0;i<linkedlist.size();i++){
            String s = linkedlist.get(i);
            System.out.println(s);
        }
        System.out.println("-----------------");
        //增强for循环
        for(String s:linkedlist){
            System.out.println(s);
        }

    }
}
