package com.io.bytestream.byteoutputstream.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *FileOutputStream:文件输出流用于将数据写入File
 * FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
 * */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节流对象
        //FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("code_iostream\\测试.txt");
        /*
        * 做了三件事情：
        * 1.调用系统功能创建了文件
        * 2.创建了字节输出流对象
        * 3.让字节输出流对象指向创建好的文件
        * */
//void write(int b):将指定的字节写入此文件输出流
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(55);
        fos.write(54);
        fos.write(53);
        fos.write(52);
        fos.write(51);
        fos.write(50);
        fos.write(49);
        fos.write(48);

        //最后都要释放资源
        //void close():关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();
    }
}
