package com.day08;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入一个字符串数据：");

        String line = s.nextLine();

        System.out.println("你输入的数据是："+line);
    }
}
