package com.fxq.day08.subject01;

import java.util.Scanner;

//键盘录入一个字符串,然后定义一个方法判断该字符串是否为对称的字符串
//	例如:
//		键盘录入的是 abc , 那么 在控制台打印 该字符串就不是 对称的字符串
//		键盘录入的是 cbc , 那么 在控制台打印 该字符串就是 对称的字符串
public class StringDemo {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        boolean result = isDuiCheng(line);
        if(result){
            System.out.println("该字符串是对称的");
        }else{
            System.out.println("该字符串不是对称的");
        }
    }
    public static boolean isDuiCheng(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        if(s.equals(ss)){
            return true;
        }else{
            return false;
        }
    }
}
