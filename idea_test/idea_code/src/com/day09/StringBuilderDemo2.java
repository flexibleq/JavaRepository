package com.day09;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String s2 = reverse(line);
        System.out.println(s2);


    }

    public static String reverse(String s){
       StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        return s1;

//        return new StringBuilder(s).reverse().toString();
    }
}
