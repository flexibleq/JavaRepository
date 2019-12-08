package com.day09;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        System.out.println(array.remove("world"));
        System.out.println(array.remove(1));

        System.out.println(array.set(0,"helloworldjava"));

        System.out.println("array:"+array);
//        System.out.println(array.get(3));
    }
}
