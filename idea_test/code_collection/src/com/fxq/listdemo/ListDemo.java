package com.fxq.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//list集合特点：
//  有序：存储和取出的元素顺序一致
//  可重复：存储的元素可以重复
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素(可重复)
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        //遍历集合
        //获取迭代器对象
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);

        }

    }
}
