package com.io.ioputstreamreader.bufferedRW.bufferedspecial;

import java.io.*;

/*
* 字符缓冲流的特有功能
* BufferedWriter:
* void newLine():写一行行分隔符，行分隔符字符串由系统属性定义
* BufferedReader:
* public String readLine():读一行文字
* 结果包含行的内容的字符串，不包括任何终止字符，如果流的结尾已经到达，则为null
* */
public class BufferedSpecialDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流
        //BufferedWriter bw = new BufferedWriter(new FileWriter("code_iostream\\bw.txt"));
       /* for (int i = 0; i < 10; i++) {
            bw.write("hello"+i);
            //bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }
        bw.close();*/

       //创建字符输入流
        BufferedReader br = new BufferedReader(new FileReader("code_iostream\\bw.txt"));
        /*//第一次读数据
        System.out.println(br.readLine());
        //第二次读数据
        System.out.println(br.readLine());

        //第三次读数据
        System.out.println(br.readLine());*/
        //循环改进
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();



    }
}
