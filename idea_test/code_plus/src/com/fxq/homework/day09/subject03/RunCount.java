package com.fxq.homework.day09.subject03;

import java.io.*;

//实现一个验证程序运行次数的小程序，要求如下：
//	1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
//	2.程序运行演示如下:
//		第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
//		第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
//		第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
//		第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
//		(使用的次数应该存在一个文本文件中,每次启动程序都应该更改文件里的数据)
public class RunCount {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象
        //BufferedWriter bw = new BufferedWriter(new FileWriter("code_plus\\count.txt"));
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_plus\\count.txt"));

        String line;
        line = br.readLine();
        int i = Integer.parseInt(line);
        if(i>=1){
            System.out.println("欢迎使用本软件，第"+(4-i)+"次免费~");
        }else if(i>-3){
            System.out.println("本软件只能免费试用3次，欢迎您注册会员后使用~");
        }else{
            i=3;
            System.out.println("欢迎使用本软件，第"+(4-i)+"次免费~");
        }
       /* int i = 0;
        while ((line = br.readLine()) != null) {
            i = Integer.parseInt(line);
            if (i>= 1) {
                System.out.println("欢迎使用本软件，第" +(4-i) + "次免费~");
                break;
            } else if(i>-3){
                System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
                break;
            }else{
                i = 3;
                System.out.println("欢迎使用本软件，第" +(4-i) + "次免费~");
                break;
            }
        }*/
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_plus\\count.txt"));
       // System.out.println(len);
        bw.write((--i)+"");
        //释放资源
        br.close();
        bw.close();
    }
}
