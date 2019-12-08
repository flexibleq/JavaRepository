package com.io.specialstream.standardstream.standardoutputstream;

import java.io.PrintStream;

/*
* public static final PrintStream out:标准输出流，通常该流对应与现实输出或由主机环境或用户指定的另一个输出目标
* */
//标准输出流本质上是一个字节输出流
public class StandardOutputStreamDemo {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.print("hello");
        ps.print(100);

        ps.println("world");
        ps.println(100);

        System.out.print(8989);
        System.out.println("hello");
    }
}
