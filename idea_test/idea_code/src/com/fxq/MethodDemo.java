package com.fxq;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isEvenNumber(n);
        isEvenNumber();
        getMax();

        int a = sc.nextInt();
        int b = sc.nextInt();
        getMax(a,b);
        getMax(10,20);
    }

    public static void isEvenNumber() {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void getMax() {
        int a = 30;
        int b = 40;
        int max = a > b ? a : b;
        System.out.println(max);
    }

    public static void isEvenNumber(int n){
        if(n%2 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void getMax(int a,int b){
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
