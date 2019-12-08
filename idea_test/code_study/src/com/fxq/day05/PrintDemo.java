package com.fxq.day05;

public class PrintDemo {
    public static void main(String[] args) {
        //创建数组
        int [] arr = {11,22,33,44,55};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println("]");
    }
}
