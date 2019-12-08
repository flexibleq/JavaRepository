package com.io.bytestream.byteoutputstream.fileoutputthreemethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 构造方法：
* FileOutputStream(String name):创建文件输出流以指定的名称写入文件
* FileOutputStream(File file):创建文件输出流以写入由指定的File对象表示的文件
*
* 写数据的三种方式：
* void write(int b):将指定的字节写入此文件输出流
* 一次写一个字节数据
*
* void write(byte[] b):将b.length字节从指定的字节数组写入此文件输出流
* 一次写一个字节数组数据
*
* void write(byte[] b,int off,int len):将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
* 一次写一个字节数组的部分数据
* */
public class FileOutputThreeMethods {
    public static void main(String[] args) throws IOException {
        //FileOutputStream(String name):创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("code_iostream\\测试.txt");
        //new File(name)
//        FileOutputStream fos = new FileOutputStream(new File("code_iostream\\测试.txt"));

//        File file = new File("code_iostream\\测试.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);

       /* fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);*/

//       byte[] bys = {97,98,99,100,101};
//       fos.write(bys);

        //byte[] getBytes():返回字符串对应的字节数组
//        byte[] bys = "学生管理系统".getBytes();
//        fos.write(bys);

        byte[] bys = "天行健君子以自强不息，地势坤君子以厚德载物".getBytes();
        fos.write(bys,0,9);

//       fos.close();

    }
}
