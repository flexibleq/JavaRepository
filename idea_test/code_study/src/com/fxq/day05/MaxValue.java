package com.fxq.day05;

public class MaxValue {
    public static void main(String[] args) {
        int max = getMax(10, 20);
        System.out.println(max);

    }

    public static int getMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
