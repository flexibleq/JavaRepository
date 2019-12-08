package com.fxq.day04;

import java.util.Scanner;

/*第一题: 分析以下需求并实现
        1.键盘录入一个数据作为数组的长度
        2.根据录入的班级人数创建数组
        3.使用键盘录入给数组赋值
        4.求出数组的最大值
        5.求出数组的最小值*/
public class ClassDemo {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入班级的人数(数组的长度)：");
        int n = sc.nextInt();
        //创建数组
        int [] arr = new int[n];

        //键盘输入为数组赋值
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数：");
            arr[i] = sc.nextInt();
        }

        //求数组的最大值
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("该数组的最大值是："+max);

        //求数组的最小值
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("该数组的最小值是："+min);
    }
}
