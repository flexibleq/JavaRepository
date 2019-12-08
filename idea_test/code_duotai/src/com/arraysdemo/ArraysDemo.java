package com.arraysdemo;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int [] arr = {12,32,21,54,46,76,56};
        System.out.println("未排序前："+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
