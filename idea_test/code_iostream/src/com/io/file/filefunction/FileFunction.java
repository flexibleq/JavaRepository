package com.io.file.filefunction;

import java.io.File;
import java.io.IOException;

/*
* File类创建功能
* public boolean creatNewFile():当具有该名称的文件不存在时，
* 创建一个由该抽象路径名命名的新空文件
* 如果文件不存在，就创建文件，并返回true
* 如果文件存在，就不创建文件，并返回false
*
* public boolean mkdir():创建由此抽象路径名命名的目录
* 如果文件不存在，就创建文件，并返回true
* 如果文件存在，就不创建文件，并返回false
*
* public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
* */
public class FileFunction {
    public static void main(String[] args) throws IOException {
        //在F:\\iostream目录下创建一个文件java.txt
        File f1 = new File("F:\\iostream\\java.txt");
        System.out.println(f1.createNewFile());

        //在F:\\iostream目录下创建一个目录JavaSE
        File f2 = new File("F:\\iostream\\JavaSE");
        System.out.println(f2.mkdir());

        //在F:\\iostream目录下创建一个多级目录JavaWeb\\HTML
        File f3 = new File("F:\\iostream\\JavaWeb\\HTML");
        System.out.println(f3.mkdirs());

        //在F:\\iostream目录下创建一个目录javaee.txt
        File f4 = new File("F:\\iostream\\javaee.txt");
        System.out.println(f4.createNewFile());
    }

}
