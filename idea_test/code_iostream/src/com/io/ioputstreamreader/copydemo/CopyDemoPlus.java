package com.io.ioputstreamreader.copydemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* 需求：把模块目录下的OutputWriterDemo.java复制到模块目录下的Copy.java
* 数据源和目的地的分析
* 数据源：code_iostream\\OutputWriterDemo.java--读数据--Reader--InputStreamReader--FileReader
* 目的地：code_iostream\\Copy.java--写数据--Writer--OutputStreamWriter--FileWriter
*
* 思路：
* 1.根据数据源创建字符输入流对象
* 2.根据目的地创建字符输出流对象
* 3.读写数据，复制文件
* 4.释放资源
* */
public class CopyDemoPlus{
    public static void main(String[] args) throws IOException{
        //根据数据源创建字符输入流对象
        FileReader fr = new FileReader("code_iostream\\OutputWriterDemo.java");
        //根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("code_iostream\\Copy.java");
        //读写数据，复制文件
        //一次读一个字符数据
        /*int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }*/
        //一次读一个字符数组数据
        char [] chs = new char[1024];
        int len;
        while((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }
        //释放资源
        fr.close();
        fw.close();
    }
}
