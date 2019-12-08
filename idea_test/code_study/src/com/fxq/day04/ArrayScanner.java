package com.fxq.day04;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        int [] arr = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个整数：");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
