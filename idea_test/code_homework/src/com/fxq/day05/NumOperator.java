package com.fxq.day05;
       /* 1.求两个数据之和
        2.判断两个数据是否相等
        3.获取两个数中较大的值
        4.获取两个数中较小的值*/

public class NumOperator {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(compare(3,5));
        System.out.println(getMax(3,5));
        System.out.println(getMin(3,5));
    }
    //求两个数据之和
    public static int sum(int a,int b){
        return a+b;
    }
    //判断两个数据是否相等
    public static boolean compare(int a,int b ){
        return a==b;
    }

    //获取两个数中较大的值
    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
    //获取两个数中较小的值
    public static int getMin(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }

    }


}
