package com.fxq.homework.day09.subject02;

import java.io.*;
import java.util.Scanner;

//分析以下需求，并用代码实现
//	1.从键盘接收一个小视频路径
//	2.将这个视频复制到D盘下avi文件中
//	3.要求使用缓冲流来实现
public class BufferedCopyAvi {
    public static void main(String[] args) throws IOException{
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小视频路径：");
        String path = null;
        File srcFile = null;
        while(true){
             path = sc.nextLine();
             srcFile = new File(path);
            if(srcFile.isFile() && srcFile.getName().endsWith(".avi")){
                break;
            }else{
                System.out.println("请输入正确的小视频路径：");
            }
        }

        //创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        //创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\"+srcFile.getName()));

        //读写数据，复制视频
        byte [] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        //释放资源
        bos.close();
        bis.close();
        /*//创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader(path));
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\avi\\a.avi"));
        //读写数据，复制文件
        char [] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }
        //释放资源
        bw.close();
        br.close();*/
    }
}
