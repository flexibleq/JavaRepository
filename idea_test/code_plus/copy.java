package com.fxq.classcode.day03.bublesort;

public class BubleSort {
    public static void main(String[] args) {
        int [] arr = {12,65,45,32,21,90,54,63,28,79,44};
        System.out.println("排序前的数组：");
        printArray(arr);
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的数组：");
        printArray(arr);
    }
    public static void printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        System.out.println(s);
    }
}
