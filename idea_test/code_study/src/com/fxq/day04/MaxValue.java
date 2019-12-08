package com.fxq.day04;

public class MaxValue {
    public static void main(String[] args) {
        int [] arr = {12,54,76,43,23,56};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max:"+max);
    }
}
