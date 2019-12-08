package com.fxq.day06;

public class Reverse {
    public static void main(String[] args) {
        //创建一个数组
        int [] arr = {11,22,33,44,55,66,77,88};
        print(arr);
        reverse(arr);
        print(arr);

    }

    public static void reverse(int[] arr){
        for(int start =0,end = arr.length-1;start<end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    public static void print(int[] arr){
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
