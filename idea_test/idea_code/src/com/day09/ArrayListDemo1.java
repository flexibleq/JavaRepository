package com.day09;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("笑傲江湖");
        array.add("神雕侠侣");
        array.add("天龙八部");

        for(int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
