package com.fxq.classcode.day04;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "12 34 65 54 33 27 89 67 57";
        //将他切割成一个字符串数组
        String[] strArr = s.split(" ");
        //定义一个整型数组
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
