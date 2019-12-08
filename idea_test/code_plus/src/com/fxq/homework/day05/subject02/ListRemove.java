package com.fxq.homework.day05.subject02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListRemove {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("def");
        list.add("java");

        //删除"def"
        list.remove("def");

        //遍历
        //迭代器遍历
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

       /* //迭代器遍历并删除
        ListIterator<String> lit = list.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            if(s.equals("def")){
                lit.remove();
            }
        }
        System.out.println(list);*/
    }
}
