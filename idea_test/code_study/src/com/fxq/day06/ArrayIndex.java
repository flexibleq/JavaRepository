package com.fxq.day06;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        //创建数组
        int [] arr = {11,22,33,44,55,66,77,88};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        int index = getIndex(arr, number);
        System.out.println("index："+index);

    }

    public static int getIndex(int[] arr,int value){
        int index = -1;
        for(int i=0;i<arr.length;i++){
           if(value == arr[i]){
               index = i;
               break;
           }
        }
        return index;
    }
}
