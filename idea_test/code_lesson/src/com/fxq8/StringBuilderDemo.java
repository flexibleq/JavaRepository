package com.fxq8;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb.length():"+sb.length());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2.length():"+sb2.length());

        StringBuilder sb3 = new StringBuilder();

        //StringBuilder sb4 = sb3.append("hello");
//        sb3.append("hello");
//        sb3.append("java");
//        sb3.append("100");
            sb3.append("hello").append("java").append(100);
        System.out.println("sb3:"+sb3);
        System.out.println("sb3.length():"+sb3.length());
        sb3.reverse();
        System.out.println("sb3:"+sb3);
    }
}
