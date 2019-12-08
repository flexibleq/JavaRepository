package com.fxq;

public class Test4 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for(int x=2;x<arr.length;x++){
            arr[x] = arr[x-1]+arr[x-2];
            System.out.println(arr[x]);
        }
        System.out.println(arr[19]);
    }
}
