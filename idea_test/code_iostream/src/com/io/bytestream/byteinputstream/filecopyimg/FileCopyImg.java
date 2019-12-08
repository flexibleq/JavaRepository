package com.io.bytestream.byteinputstream.filecopyimg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* 需求：把"D:\\helloworld.jpg"复制到模块目录下的helloworld.jpg
*
* 思路：
* 1.根据数据源创建字节输入流对象
* 2.根据目的地创建字节输出流对象
* 3.读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
* 4.释放资源
* */
public class FileCopyImg {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\helloworld.jpg");
        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("code_iostream\\helloworld.jpg");

        //读写数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
        byte [] bys = new byte [1024];
        int len;
        while((len = fis.read(bys)) != -1){
                fos.write(bys,0,len);
        }
        //释放资源
        fis.close();
        fos.close();
    }
}
