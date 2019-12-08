package com.fxq.classcode.day09;

import java.io.*;

public class InOutRwDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("code_plus\\BubleSort.java"));
        //根据目的地创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("code_plus\\copy.java"));

        //读写数据，复制文件
        //一次读写一个字符数据
       /* int ch;
        while((ch = isr.read()) != -1){
            osw.write(ch);
        }*/

       //一次读写一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while((len = isr.read(chs)) != -1){
            osw.write(chs,0,len);
        }

        isr.close();
        osw.close();
    }
}
