package com.io.bytestream.byteinputstream.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 把文件fos.txt中的内容读取出来在控制台输出
 * FileInputStream:从文件系统中的文件获取输入字节
 * FileInputStream(String name):通过打开与实际文件的连接来创建一个FileInputStream,该文件由文件系统中的路径名name命名
 *
 * 使用字节输入流读数据的步骤
 *   1.创建字节输入流对象
 *   2.调用字节输入流对象的读数据方法
 *   3.释放资源
 * */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        //FileInputStream(String name)
        FileInputStream fis = new FileInputStream("code_iostream\\测试.txt");
        //int read():从该输入流读取一个字节的数据
       /* //第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char)by);

        //再多读取两次
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);*/
        //如果达到文件末尾，返回-1
        //采用循环优化读取数据
        /*int by;
        while((by = fis.read()) != -1){
            System.out.print((char)by);
        }*/
        int by;
        while ((by = fis.read()) != -1){
            System.out.print((char)by);
        }

            //释放资源
            fis.close();
    }
}
