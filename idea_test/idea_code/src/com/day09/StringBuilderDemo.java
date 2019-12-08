package com.day09;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println(s);
        String s1 = "world";
        StringBuilder sb1 = new StringBuilder(s1);
        sb1.reverse();
        System.out.println(sb1);
        System.out.println(s1);
    }
}
