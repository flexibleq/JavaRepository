package com.bublesort;

import java.util.Scanner;

/*
    * 冒泡排序：一种排序的方法，对要进行的排序的数据中相邻的数据进行两两比较，将较大的数据放在后面
    * 依次对所有的的数据进行操作，直至所有数据按要求完成排序
    * */
public class BubleSort {
    public static void main(String[] args) {
        int [] arr = {12,34,56,21,14,32,8,22,5};
        System.out.println("未排序前："+arrayToString(arr));

        bubleSort(arr);
        System.out.println("排序后："+arrayToString(arr));


    }

    public static String arrayToString(int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]);
                sb.append(",");
            }
        }
        sb.append("]");
        String sss = sb.toString();
        return sss;
    }

    public static void bubleSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
