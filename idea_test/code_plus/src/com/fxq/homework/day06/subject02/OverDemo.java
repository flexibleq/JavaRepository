package com.fxq.homework.day06.subject02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OverDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("aaa");
        array.add("bbb");
        array.add("ccc");
        array.add("aaa");
        array.add("bbb");
        array.add("bbb");

        //创建Set集合存储不重复的元素
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < array.size(); i++) {
            set.add(array.get(i));
        }
        //遍历
        //迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");
        //增强for循环
        for(String s:set){
            System.out.println(s);
        }
    }
}
