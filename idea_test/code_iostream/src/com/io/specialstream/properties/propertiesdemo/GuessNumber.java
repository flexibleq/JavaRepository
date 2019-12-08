package com.io.specialstream.properties.propertiesdemo;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

    }
    public static void guessNumber(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(100);
        System.out.println("请输入你猜的数字：");
        while(true){
            int i = sc.nextInt();
            if(i>number){
                System.out.println("比随机数大，请重新猜：");
            }else if(i<number){
                System.out.println("比随机数小，请重新猜：");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
