package com.fxq.homework.day03.subject06;
/*
1,键盘录入一个整数作为数组的长度,然后通过随机数为该数组赋值
        2,然后对数组进行 升序排列
        3,最后将数组的元素 拼接成 [1,3,4...] 这种形式
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        //键盘录入数组长度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();

        //创建数组
        int[] arr = new int[n];

        //产生随机数对象
        Random r = new Random();

        //遍历数组为其赋随机值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        //排序
        // Arrays.sort(arr);
        bubleSort(arr);
        //将数组元素拼接成一个字符串
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        System.out.println(s);

    }

    public static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
