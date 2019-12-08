package com.io.file.filedelete;

import java.io.File;
import java.io.IOException;

/*
* File类删除功能
* public boolean delete():删除由此抽象路径名表示的文件或目录
* */
public class FileDelete {
    public static void main(String[] args) throws IOException {
        //在当前模块目录下创建java.txt文件
        File f1 = new File("code_iostream\\java.txt");
        //System.out.println(f1.createNewFile());

        //删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());
        System.out.println("--------------------");

        //在当前模块目录下创建itcast目录
        File f2 = new File("code_iostream\\itcast");
        //System.out.println(f2.mkdir());

        //删除当前模块目录下的itcast目录
        System.out.println(f2.delete());
        System.out.println("-----------------------");

        //在当前模块目录下创建一个目录itcast,然后在该目录下创建一个文件java.txt
        File f3 = new File("code_iostream\\itcast");
        System.out.println(f3.mkdir());
        File f4 = new File("code_iostream\\itcast\\java.txt");
        System.out.println(f4.createNewFile());

        //删除当前模块目录下的itcast目录
        //如果一个目录中有内容（目录，文件），不能直接删除
        //应该先删除目录中的内容，最后才能删除目录
        System.out.println(f4.delete());
        System.out.println(f3.delete());
    }
}
