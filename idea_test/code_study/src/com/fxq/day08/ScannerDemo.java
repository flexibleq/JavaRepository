package com.fxq.day08;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = sc.nextInt();
        System.out.println(i);
        //nextInt()和nextLine()一起用会产生冲突，nextLine()方法不执行
        /*System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        System.out.println(line);*/
        //目前解决方案：使用next（）方法,结束标记为空格
        System.out.println("请输入一个字符串：");
        String line = sc.next();
        System.out.println(line);

    }
}
