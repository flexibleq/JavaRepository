package com.io.specialstream.copyjavademo;

import java.io.*;

/*
* 把模块目录下的PrintStreamDemo.java复制到模块目录下的Copy.java
* 思路：
* 1.根据数据源创建字符输入流对象
* 2.根据目的地创建字符输出流对象
* 3.读写数据，复制文件
* 4.释放资源
* */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException{
       /* //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_iostream\\OutputWriterDemo.java"));
        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("code_iostream\\Copy.java"));
        //读写数据，复制文件
        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();*/

       //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_iostream\\OutputWriterDemo.java"));
        //根据目的地创建字符打印流
        PrintWriter pw = new PrintWriter(new FileWriter("code_iostream\\Copy.java"),true);
        //读写数据，复制文件
        String line;
        while((line = br.readLine()) != null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
