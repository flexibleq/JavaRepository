package com.io.ioputstreamreader.readerdemo;

import java.io.*;
import java.util.Arrays;

/*
* InputStreamReader:是从字节流到字符流的桥梁
* 他读取字节，并使用指定的编码将其解码为字符
* 他使用的字符集可以有名称指定，也可以被明确指定，或者可以接受平台的默认字符集
*
* OutputStreamReader：是从字符流到字节流的桥梁
* 使用指定的编码将写入的字符编码为字节
* 他使用的字符集可以有名称指定，也可以被明确指定，或者可以接受平台的默认字符集
* */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter
        //OutputStreamWriter(OutputStream out,String charSetName)创建一个使用命名字符集的OutputStreamWriter
//        FileOutputStream fos = new FileOutputStream("code_iostream\\osw.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("code_iostream\\osw.txt"));
//        osw.write("中国");
//        osw.close();
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("code_iostream\\osw.txt"));
//        int ch;
//        while((ch = isr.read()) != -1){
//            System.out.print((char)ch);
//        }
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("code_iostream\\osw.txt"),"GBK");
        osw.write("中国");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("code_iostream\\osw.txt"),"GBK");
        /*int ch;
        while((ch = isr.read()) != -1){
            System.out.print((char) ch);
        }*/
        char [] chs = new char [1024];
        int len;
        while((len = isr.read(chs)) != -1){
            System.out.print(new String(chs,0,len));
        }


    }
}
