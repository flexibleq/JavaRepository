package com.fxq.classcode.day05;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,67,78,89,90};
        binarySearch(arr,45);
    }
    public static void binarySearch(int[] arr,int value){
        int left = 0;
        int right = arr.length-1;
        int mid = (left+right)>>1;

        while(true){
            if(value == arr[mid]){
                System.out.println(mid);
                break;
            }else if(value< arr[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
            mid = (left + right)>>1;

            if(left > right){
                System.out.println(value+"在数组中不存在");
                break;
            }
        }

    }
}
