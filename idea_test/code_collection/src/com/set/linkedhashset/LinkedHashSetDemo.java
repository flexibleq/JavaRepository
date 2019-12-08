package com.set.linkedhashset;
//LinkedHashSet特点：
//1.哈希表和链表实现的Set接口，具有可预测的迭代次序
//2.由链表保证元素有序，也就是说元素的存储和取出顺序一致
//3.由哈希表保证元素唯一，也就是说没有重复的元素

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //添加元素
        lhs.add("hello");
        lhs.add("world");
        lhs.add("java");

        //不可重复
        lhs.add("world");
        //遍历
        //迭代器遍历
        Iterator<String> it = lhs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("-----------");
        //增强for循环遍历
        for(String s:lhs){
            System.out.println(s);
        }
    }
}
