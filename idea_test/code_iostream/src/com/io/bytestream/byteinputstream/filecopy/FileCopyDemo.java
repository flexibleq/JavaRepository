package com.io.bytestream.byteinputstream.filecopy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 把"F:\\iostream\\测试.txt"复制到模块目录下的"测试.txt"
* 数据源：
* F:\\iostream\\测试.txt--读数据--InputStream---FilrInputStream
* 目的地：
* code_iostream\\测试.txt--写数据--OutputStream--FileOutputStream
*
* 思路：
* 1.根据数据源创建字节输入流对象
* 2.根据目的地创建字节输出流对象
* 3.读写数据，复制文本文件（一次性读一个字节，一次性写一个字节）
* 4.释放资源
*
* */
public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("F:\\iostream\\测试.txt");
        //根据数据源创建字节输入流对象
        FileOutputStream fos = new FileOutputStream("code_iostream\\测试.txt");
        //读写数据，复制文本文件
        int by;
        while((by = fis.read()) != -1){
            fos.write(by);
        }
        //释放资源
        fis.close();
        fos.close();
    }
}
