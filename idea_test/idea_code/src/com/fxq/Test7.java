package com.fxq;

public class Test7 {
    public static void main(String[] args) {
        int [] arr1 = {11,22,33,43,55};
        int [] arr2 = {11,22,33,44,55};
        boolean res = compare(arr1,arr2);
        System.out.println(res);
    }
    public static boolean compare(int[] arr,int[] arr1){
        if(arr.length != arr1.length){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != arr1[i]){
                return false;
            }
        }
        return true;
    }
}
