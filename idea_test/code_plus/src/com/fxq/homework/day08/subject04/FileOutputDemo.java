package com.fxq.homework.day08.subject04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//
//题目四. 在D盘下，有一c.txt 文件中内容为：HelloWorld
//在c.txt文件原内容基础上，
// 添加五句 I love java，而且要实现一句一行操作
// (注：原文不可覆盖)。
public class FileOutputDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileInputStream fis = new FileInputStream("D:\\c.txt");

        byte [] bys = new byte [64];
        int len;
        while((len = fis.read(bys)) != -1){
//            System.out.println(new String(bys,0,len));
        }
        FileOutputStream fos = new FileOutputStream("D:\\c.txt");
        fos.write(bys);
        //调用写数据方法
        for (int i = 0; i < 5; i++) {
            fos.write("\r\n".getBytes());
            fos.write("I love java".getBytes());
        }
        //释放资源
        //fis.close();
        fos.close();
    }

}
