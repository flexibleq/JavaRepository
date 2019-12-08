package com.io.specialstream.standardstream.standardinputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
* public static final InputStream in:标准输入流，通常该流对应于键盘输入或由主机环境
* 或用户指定的另一个输入源
* */
public class StandardInputStreamDemo {
    public static void main(String[] args) throws IOException{
      /*  InputStream is = System.in;
        *//*int by;
        while((by = is.read()) != -1){
            System.out.print((char)by);
        }*//*

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串：");
        String s = br.readLine();
        System.out.println("你输入的字符串是：");
        System.out.println(s);

        System.out.println("请输入一个整数：");
        String ss = br.readLine();
        System.out.println("你输入的整数是："+Integer.parseInt(ss));

    }
}
