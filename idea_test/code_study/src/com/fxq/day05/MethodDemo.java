package com.fxq.day05;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber();
        System.out.println("----------");
        isEvenNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean result = isEvenNumber(num);
        System.out.println(result);
    }

    public static void isEvenNumber(){
        int num = 10;
        if(num % 2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }

    }
}
