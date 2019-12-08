package com.generic.changedvalue;

public class ChangedValue {
    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,50,60));
        System.out.println(sum(10,20,30,40,50,60,70,80,90));

    }
//不使用可变参数
   /* public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }*/

   //使用可变参数
    //实质上是一个数组
    //如果方法有多个参数，包含可变参数，可变参数放最后
    public static int sum(int b,int ...a){
        int sum = 0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
}
