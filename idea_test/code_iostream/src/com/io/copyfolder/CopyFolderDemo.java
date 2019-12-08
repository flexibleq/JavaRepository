package com.io.copyfolder;

import java.io.*;

/*
* 需求：把F:\\test这个文件夹复制到模块目录下
* 思路：
* 1.创建数据源目录File对象，路径是F:\\test
* 2.获取数据源目录File对象的名称（test）
* 3.创建目的地目录File对象，路径名是模块名+test组成（code_iostream\\test）
* 4.判断目的地目录是否存在，若不存在，就创建
* 5.获取数据源目录下的所有文件的File数组
* 6.遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
* 7.获取数据源文件的名称
* 8.创建目的地文件File对象，路径名是目的地目录+名称
* 9.复制文件
* 由于是文本文件，还有图片，视频等文件，所以采用字节流复制文件
* */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException{
        //创建数据源目录
        File srcFolder = new File("F:\\test");
        //获取数据源目录对象的名称
        String srcFolderName = srcFolder.getName();
        //创建目的地目录对象
        File destFolder = new File("code_iostream",srcFolderName);
        //判断目的地目录是否存在，若不存在，就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取数据源目录下的所有文件的File数组
        File[] listFiles = srcFolder.listFiles();
        //遍历File数组
        for(File srcFile:listFiles){
            //获取数据源文件的名称
            String srcFileName = srcFile.getName();
            //创建目的地文件File对象，路径名是目录+名称
            File destFile = new File(destFolder,srcFileName);
            //复制文件
            copyFile(srcFile,destFile);
        }
    }
    public static void copyFile(File f1,File f2) throws IOException{
        //创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
        //创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2));
        //读写数据，复制文件
        byte [] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        //释放资源
        bis.close();
        bos.close();
    }
}
