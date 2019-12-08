package com.io.bufferedstream.bufferedstreamdemo;

import java.io.*;

/*
* 字节缓冲流：
* BufferedOutputStream
* BufferedInputStram
*
* 构造方法：
* 字节缓冲输出流：BufferedOutputStream(OutputStream out)
* 字节缓冲输入流：BufferedInputStream(InputStream)
* */
public class BufferdStreamDemo {
    public static void main(String[] args) throws IOException {
        //* 字节缓冲输出流：BufferedOutputStream(OutputStream out)
//        FileOutputStream fos = new FileOutputStream("code_iostream\\bos.txt");
////        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("code_iostream\\bos.txt"));
//        //写数据
//        bos.write("hello\r\n".getBytes());
//        bos.write("world\r\n".getBytes());
//        bos.write("java\r\n".getBytes());
//        //释放资源
//        bos.close();

        //字节缓冲输入流：BufferedInputStream(InputStream)
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("code_iostream\\bos.txt"));
        //读数据
        /*int len;
        while((len = bis.read()) != -1){
            System.out.print((char)len);
        }
        //释放资源
        bis.close();*/

        byte [] bys = new byte [1024];
        int len;
        while((len = bis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }
    }
}
