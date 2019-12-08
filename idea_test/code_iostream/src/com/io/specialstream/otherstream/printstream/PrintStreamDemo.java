package com.io.specialstream.otherstream.printstream;

import java.io.IOException;
import java.io.PrintStream;

/*
* 打印流的特点：
* 只负责输出数据，不负责读取数据
* 有自己的特有方法
*
* 字节打印流：
* PrintStream(String fileName):使用指定的文件名创建新的打印流
* */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("code_iostream\\ps.txt");
       /* ps.write(97);
        ps.write(98);*/

      /* ps.print(97);
       ps.println();
       ps.print(98);*/
      ps.println(97);
      ps.println(98);
    }
}
