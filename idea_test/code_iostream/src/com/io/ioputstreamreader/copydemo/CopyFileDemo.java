package com.io.ioputstreamreader.copydemo;

import java.io.*;

/*
* 需求：将模块目录下的OutputWriterDemo.java复制到模块目录下的Copy.java
* 思路：
* 1.根据数据源创建字符输入流对象
* 2.根据目的地创建字符输出流对象
* 3.读写数据，复制文件
* 4.释放资源
*
* */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("code_iostream\\OutputWriterDemo.java"));
        //根据目的地创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("code_iostream\\Copy.java"));
        //读写数据，复制文件
        //一次读一个字符数据
//        int ch;
//        while((ch = isr.read()) != -1){
//            osw.write(ch);
//        }
        //一次读一个字符数组数据
        char [] chs = new char [1024];
        int len;
        while((len = isr.read(chs)) != -1){
            osw.write(chs,0,len);
        }
        //释放资源
        isr.close();
        osw.close();
    }
}
