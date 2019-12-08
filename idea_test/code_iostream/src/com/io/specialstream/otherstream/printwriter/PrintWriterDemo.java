package com.io.specialstream.otherstream.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
* 字符流的构造方法：
* PrintWriter(String fileName):使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新
*
* PrintWriter(Writer out,boolean autoFlush):创建一个新的PrintWriter
* out：字符输出流
* autoFlush：一个布尔值，如果为真，则println,printf,或format方法将刷新输出缓冲区
* */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException{
        //PrintWriter(String fileName):使用指定的文件名创建一个新的PrintWriter
        //PrintWriter pw = new PrintWriter("code_iostream\\pw.txt");
        /*pw.write(97);
        pw.write("\r\n");
        pw.write(98);
        pw.write("\r\n");
        pw.flush();*/

        /*pw.print("hello");
        pw.flush();
        pw.print("world");
        pw.flush();

        pw.println("hello");
        pw.flush();
        pw.println("world");
        pw.flush();*/

        PrintWriter pw = new PrintWriter(new FileWriter("code_iostream\\pw.txt"),true);
        pw.println("hello");
        pw.println("world");

        pw.close();
    }
}
