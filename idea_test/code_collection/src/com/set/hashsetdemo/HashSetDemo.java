package com.set.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;

//HashSet集合特点
//1.底层数据结构是哈希表
//2.对集合迭代顺序不作任何保证，也就是说不保证存储和取出顺序一致
//3.没有带索引的方法，不能使用普通for循环遍历
//4.由于是set集合，所以不能存储重复元素
public class HashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new HashSet<String>();
        //添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");

        //元素不可重复
       // hs.add("world");

        //遍历
        //迭代器方式
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //增强for循环遍历
        for(String s:hs){
            System.out.println(s);
        }

    }
}
