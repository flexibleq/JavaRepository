package com.fxq.listmethod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        //void add(int index,E element):在此集合中指定位置插入指定的元素

//        list.add(1,"javaee");

        //E remove(int index):删除指定索引处的元素，返回被删除的元素
//        System.out.println(list.remove(1));
//        System.out.println(list.remove(11));IndexOutOfBoundsException

        //E set(int index,E element):修改指定索引处的元素，返回被修改的元素
//        System.out.println(list.set(1,"javaee"));
//        System.out.println(list.set(1,"javase"));

        //E get(int index):返回指定索引处的元素

//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
       // System.out.println(list);

        //迭代器遍历
       /* Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String ss = it.next();
            System.out.println(ss);
        }*/


        //遍历集合  集合名.fori
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
