package com.fxq.classcode.day12.myarraylist;

/**
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList<String> my = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            my.add("aaa");
        }
        my.add("bbb");
        for (int i = 0; i < 4; i++) {
            my.add("ccc");
        }
        my.add("eeee");
        for (int i = 0; i < 10; i++) {
            my.add("ffff");
        }
        System.out.println(my);
        System.out.println(my.size());
    }
}
