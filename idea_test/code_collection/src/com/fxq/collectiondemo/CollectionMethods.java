package com.fxq.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        //public boolean add(E e)添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //public boolean remove(Object o) 从集合中移除指定的元素
        //System.out.println(c.remove("hello"));
        //System.out.println(c.remove("javaee"));

        //public void clear() 清空集合中的元素
       // c.clear();

        //public boolean contains(Object o) 判断集合中是否存在指定的元素
        //System.out.println(c.contains("hello"));
        //System.out.println(c.contains("javaee"));
        //public boolean isEmpty() 判断集合是否为空
       // System.out.println(c.isEmpty());
        //public int size() 集合的长度，也就是集合中元素的个数
        System.out.println(c.size());

        System.out.println(c);
    }
}
