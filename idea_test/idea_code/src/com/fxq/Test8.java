package com.fxq;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int [] arr = {19,28,37,46,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int n = sc.nextInt();
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                index = i;
            }
        }
        System.out.println(index);
    }
}
