package com.fxq.day08;

import java.util.Scanner;

public class StringTraverse {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //遍历
        //方式一
        for(int i=0;i<line.length();i++){
            char c = line.charAt(i);
            System.out.println(c);
        }
        System.out.println("-----------------------");
        //方式二
        char[] ch = line.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
