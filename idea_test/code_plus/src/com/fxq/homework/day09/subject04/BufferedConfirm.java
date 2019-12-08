package com.fxq.homework.day09.subject04;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//实现一个验证码小程序，要求如下：
//	1. 在项目根目录下新建一个文件：data.txt,
// 键盘录入3个字符串验证码，并存入data.txt中，
// 要求一个验证码占一行；
//	2. 键盘录入一个需要被校验的验证码
//		如果输入的验证码在data.txt中存在：	在控制台提示验证成功
//		如果输入的验证码在data.txt中不存在：在控制台提示验证失败
public class BufferedConfirm {
    public static void main(String[] args) throws IOException{
        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_plus\\data.txt"));
        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入一个字符串验证码：");
            String line = sc.nextLine();
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //bw.write(line);
        //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_plus\\data.txt"));
        //键盘录入一个需要验证的验证码
        System.out.println("请输入一个需要验证的验证码：");
        String s = sc.nextLine();
        //读取数据
       // char [] chs = new char[1024];
        String ss;
        while((ss = br.readLine())!=null){
           if(s.equals(ss)){
               System.out.println("验证成功");
               return ;
           }
        }
        System.out.println("验证失败");
        //释放资源
        bw.close();
        br.close();
    }
}
