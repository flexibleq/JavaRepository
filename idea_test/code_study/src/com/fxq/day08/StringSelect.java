package com.fxq.day08;

import java.util.Scanner;

public class StringSelect {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);
            if(ch>='a' && ch<='z'){
                smallCount++;
            }else if(ch>='A' && ch<='Z'){
                bigCount++;
            }else if(ch>='0' && ch<='9'){
                numberCount++;
            }
        }

        System.out.println("大写字母有："+bigCount+"个");
        System.out.println("小写字母有："+smallCount+"个");
        System.out.println("数字有："+numberCount+"个");
    }
}
