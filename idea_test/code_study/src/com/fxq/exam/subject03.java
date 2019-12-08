package com.fxq.exam;

import java.util.Random;

//定义一个长度为10的数组，
// 随机生成10个（0-100）的值存入数组。
// 从小到大或者从大到小进行排序。。
public class subject03 {
    public static void main(String[] args) {
        //创建数组
        int [] arr  = new int [10];
        //创建随机数对象
        Random r = new Random();
        //为数组赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        //遍历排序前的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //冒泡排序
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        //遍历排序后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
