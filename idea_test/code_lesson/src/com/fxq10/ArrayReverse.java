package com.fxq10;

import java.util.Scanner;

public class ArrayReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        String s1 = arrayReverse(s);
        System.out.println("result:"+s1);

    }

    public static String arrayReverse(String s){
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String s1 = sb.toString();
//        return s1;
        return new StringBuilder(s).reverse().toString();
    }
    public void aaa()
    {
        System.out.println("aaa");
    }
}
