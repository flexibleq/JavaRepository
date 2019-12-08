package com.fxq.linkedmethod;

import java.util.LinkedList;
//public void addFirst():在该列表开头插入指定的元素
//public void addLast():将指定的元素追加到列表的末尾
//public E getFirst():返回此列表的第一个元素
//public E getLast():返回此列表的最后一个元素
//public E removeFirst():从此列表中删除并返回第一个元素
//publci E removeLast():从此列表中删除并返回最后一个元素

public class LinkedListMethod {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> linkedlist = new LinkedList<String>();
        //添加元素
        linkedlist.add("hello");
        linkedlist.add("world");
        linkedlist.add("java");
        //public void addFirst():在该列表的开头插入指定的元素
        //linkedlist.addFirst("javase");
        //public void addLast():将指定的元素追加到集合的末尾
        //linkedlist.addLast("javaee");

        //public E getFirst()：返回此列表的第一个元素
        //System.out.println(linkedlist.getFirst());
        //public E getLast():返回此列表的最后一个元素
        //System.out.println(linkedlist.getLast());

        //public E removeFirst():从此列表中删除并返回第一个元素
        System.out.println(linkedlist.removeFirst());
        //public E removeLast():从此列表中删除并返回最后一个元素
        System.out.println(linkedlist.removeLast());
        //输出该集合
        System.out.println(linkedlist);
}
}
