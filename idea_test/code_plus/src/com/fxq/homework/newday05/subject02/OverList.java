package com.fxq.homework.newday05.subject02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OverList {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        list.add("bbb");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("eee");
        //
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
        }

        //遍历
        //迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("----------");
        //增强for循环
        for(String s:list){
            System.out.println(s);
        }
    }
}
