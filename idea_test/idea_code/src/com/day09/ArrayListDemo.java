package com.day09;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<String> array = new ArrayList<>();

        ArrayList<String> array = new ArrayList<String>();

//        System.out.println(array.add("hello"));

        array.add("hello");
        array.add("world");
        array.add("java");


        array.add(1,"javase");

        array.add(3,"javaee");


        System.out.println("array:"+array);


    }
}
