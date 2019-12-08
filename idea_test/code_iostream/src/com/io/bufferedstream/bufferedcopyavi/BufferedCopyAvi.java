package com.io.bufferedstream.bufferedcopyavi;

import java.io.*;

/*
* 需求：把F:\\audio\\fdslk.wmv复制到模块目录下的fdslk.wmv
* 思路：
* 1.根据数据源创建字节输入流对象
* 2.根据目的地创建字节输出流对象
* 3.读写数据，复制视频（一次读取一个字节数组，一次写入一个字节数组）
* 4.释放资源
*
* 四种方式复制视频，并记录每种方式赋值视频的时间
* 1.基本字节流一次读写一个字节//共耗时11857毫秒
* 2.基本字节流一次读写一个字节数组//共耗时47毫秒
* 3.字节缓冲流一次读写一个字节//共耗时484毫秒
* 4.字节缓冲流一次读写一个字节数组//共耗时0毫秒
*
* */
public class BufferedCopyAvi {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();
        //method1();
        //method2();
//        method3();
        method4();
        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时"+(endTime - startTime)+"毫秒");
    }
    //基本字节流一次读写一个字节
    public static void method1() throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("F:\\iostream\\audio\\fdslk.wmv");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("code_iostream\\fdslk.wmv");
        //读写数据
        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }
        //释放数据
        fis.close();
        fos.close();
    }

    //基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("F:\\iostream\\audio\\fdslk.wmv");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("code_iostream\\fdslk.wmv");
        //读写数据
        byte [] bys = new byte [1024];
        int len;
        while((len = fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        //释放资源
        fis.close();
        fos.close();
    }

    //字节缓冲流一次读写一个字节
    public static void method3() throws IOException {
        //根据数据源创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\iostream\\audio\\fdslk.wmv"));
        //根据目的地创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("code_iostream\\fdslk.wmv"));
        //读写数据
        int by;
        while((by = bis.read()) != -1){
            bos.write(by);
        }
        //释放资源
        bis.close();
        bos.close();
    }

    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        //根据数据源创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\iostream\\audio\\fdslk.wmv"));
        //根据目的地创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("code_iostream\\fdslk.wmv"));
        //读写数据
        byte [] bys = new byte [1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        //释放资源
        bis.close();
        bos.close();

    }
}
