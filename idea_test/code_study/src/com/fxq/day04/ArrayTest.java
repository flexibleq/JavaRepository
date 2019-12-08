package com.fxq.day04;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-------------");

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("---------------");

        int [] arr1 = arr;
        arr1[0] = 125;
        arr[2] = 345;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr1);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
