package com.io.bytestream.byteinputstream.fileinputstreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
* 需求：把文件fos.txt中的内容读取出来在控制台输出
* 使用字节输入流读数据的步骤：
* 1.创建字节输入流对象
* 2.调用字节输入流对象的读数据方法
* 3.释放资源
* */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        /*File f = new File("code_iostream\\names.txt");
        f.createNewFile();*/
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("code_iostream\\names.txt");

        //调用字节输入流对象的读数据方法
        //int read(byte[] b):从该输入流读取最多b.length个字节的数据到一个字节数组
//        byte[] bys = new byte[5];
        /*//第一次读取数据
        int len = fis.read(bys);
        System.out.println(len);
        //String(byte[] b)
        System.out.println(new String(bys));

        //第二次读取数据
        len = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys));*/

        //循环改进读取数据
        byte [] bys = new byte [1024];//1024的整数倍
        int len;
        while((len = fis.read(bys)) != -1){
            System.out.println(new String(bys,0,len));
        }
        //释放资源
        fis.close();
    }
}
