package com.fxq.classcode.day05.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList<String> linkedList = new LinkedList<String>();
        //添加元素
        linkedList.add("hello");
        linkedList.add("world");

        linkedList.addFirst("java");
        linkedList.addLast("javase");

        String first = linkedList.getFirst();
        String last = linkedList.getLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println("-----------------");

        linkedList.removeFirst();
        linkedList.removeLast();

        for(String s:linkedList){
            System.out.println(s);
        }
    }
}
