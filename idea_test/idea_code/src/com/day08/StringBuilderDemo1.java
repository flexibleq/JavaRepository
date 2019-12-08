package com.day08;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        /*StringBuilder sb2 = sb.append("hello");

        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);
        System.out.println(sb == sb2);*/

        /*sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append(100);*/
        sb.append("hello").append("world").append("java").append(100);
        System.out.println("sb:"+sb);
    }
}
