package com.day08;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);

            if(ch>='A' && ch<='Z'){
                bigCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else if(ch>='0' && ch<='9'){
                numberCount++;
            }
        }

        System.out.println("该字符串中包括"+bigCount+"个大写字母，"+smallCount+"个小写字母，"+numberCount+"个数字");
    }

}
