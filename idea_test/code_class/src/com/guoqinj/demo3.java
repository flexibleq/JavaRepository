package com.guoqinj;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        //一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个5位数：");
        int number = sc.nextInt();
        isHuiWen(number);
    }
    public static void isHuiWen(int i){
        int wan = i / 10000;
        int qian = i / 1000 % 10;
        int shi = i / 10 % 10;
        int ge = i % 10;

        if(ge == wan && shi == qian){
            System.out.println(i+"是一个回文数");
        }else{
            System.out.println(i+"不是一个回文数");
        }
    }
}
