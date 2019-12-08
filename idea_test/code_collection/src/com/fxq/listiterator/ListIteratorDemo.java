package com.fxq.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //创建列表迭代器对象
        ListIterator<String> lit = list.listIterator();
        //遍历集合---正向遍历
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }

        //遍历集合---逆向遍历
        while(lit.hasPrevious()){
            String ss = lit.previous();
            System.out.println(ss);
        }

        //通过列表迭代器的add()方法在遍历集合的时候添加元素
        while(lit.hasNext()){
            String sss = lit.next();
            if(sss.equals("hello")){
                lit.add("javaee");//添加在hello后面
            }

        }
        System.out.println(list);
    }
}
