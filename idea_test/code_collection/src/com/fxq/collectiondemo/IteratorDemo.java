package com.fxq.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //通过多态创建Collection对象
        Collection<String> c = new ArrayList<String>();
        //调用add方法往集合里添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        //通过iterator（）方法获取迭代器对象
        Iterator<String> it = c.iterator();
        //调用迭代器里的next()方法获取集合里的元素
        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        //通过while循环调用hasNext()方法，遍历集合
        while(it.hasNext()){
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);

        }
    }
}
