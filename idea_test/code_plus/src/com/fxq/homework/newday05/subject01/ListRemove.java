package com.fxq.homework.newday05.subject01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemove {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("def");
        list.add("world");
        list.add("java");
        list.add("def");
        list.add("def");
        list.add("apubl");
        list.add("def");
        list.add("flsfls");
        list.add("dlfj");

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("def")){
                list.remove(i);
                i--;
            }
        }

        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
