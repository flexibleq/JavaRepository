package com.fxq.exam;
//main方法中定义3个变量：int a = 11, b = 12, c = 10;
//并依次完成以下要求：
//1.1、自定义一个方法method1(int a,int b,int c)
//用if语句求出a、b、c中最大的数并打印到控制台上；
//1.2. 自定义一个方法method2(int a,int b,int c)
//		求三个数的和打印出来。
public class Subject02 {
    public static void main(String[] args) {
        int a = 11;
        int b = 12;
        int c = 10;
        getMax(a,b,c);
        getSum(a,b,c);
    }

    public static void getMax(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("最大的数是："+a);
        }else if(b>a && b>c){
            System.out.println("最大的数是："+b);
        }else{
            System.out.println("最大的数是："+c);
        }
    }

    public static void getSum(int a,int b,int c){
        int sum = a+b+c;
        System.out.println("三个数的和是："+sum);
    }
}
