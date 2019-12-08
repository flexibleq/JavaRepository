package com.guoqinj;
//
//2.题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。 （数组内容自定义）
public class demo4 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,3,8,4,5,9,6};
        int maxIndex = getMaxIndex(arr);

        int temp = arr[0];
        arr[0] = arr[maxIndex];
        arr[maxIndex] = temp;
        int minIndex = getMinIndex(arr);
        int temp1 = arr[arr.length-1];
        arr[arr.length-1] = arr[minIndex];
        arr[minIndex] = temp1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static int getMaxIndex(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[index]){
               index = i;
            }
        }
        return index;
    }
    public static int getMinIndex(int[] arr){
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}
