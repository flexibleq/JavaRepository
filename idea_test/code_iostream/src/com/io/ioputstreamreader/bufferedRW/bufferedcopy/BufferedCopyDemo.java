package com.io.ioputstreamreader.bufferedRW.bufferedcopy;

import java.io.*;

/*
* 需求：把模块目录下的OutputWriterDemo.java复制到模块目录下的Copy.java
* 思路：
* 1.根据数据源创建字符缓冲输入流对象
* 2.根据目的地创建字符缓冲输出流对象
* 3.读写数据，复制文件
* 4.释放资源
* */
public class BufferedCopyDemo {
    public static void main(String[] args) throws IOException{
        //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_iostream\\OutputWriterDemo.java"));
        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_iostream\\Copy.java"));
        //读写数据，复制文件
        //一次读取一个字符数据
        /*int ch;
        while((ch = br.read()) != -1){
            bw.write(ch);
        }*/
        //一次读取一个字符数组
        char [] chs = new char[1024];
        int len;
        while((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }

        //释放资源
        br.close();
        bw.close();

    }
}
