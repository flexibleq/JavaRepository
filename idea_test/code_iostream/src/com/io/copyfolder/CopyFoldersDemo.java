package com.io.copyfolder;

import java.io.*;

/*
* 需求：把F:\\test复制到F盘目录下
* 思路：
* 1.创建数据源File对象，路径是F:\\test
* 2.创建目的地File对象，路径是F:\\
* 3.写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
* 4.判断数据源File是否是目录
* 是：
* 1.在目的地下创建和数据源File名称一样的目录
* 2.获取数据源File下所有文件或者目录的File数组
* 3.遍历该File数组，得到每一个File对象
* 4.把该File作为数据源File对象，递归调用复制文件夹的方法
* 不是：
* 说明是文件，直接复制，用字节流
*
* */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        //创建数据源对象
        File srcFile = new File("D:\\test");
        //创建目的地对象
        File destFile = new File("F:\\");
        copyFolder(srcFile,destFile);

    }
    public static void copyFolder(File srcFile,File destFile) throws IOException{
        //判断数据源文件是否是目录
        if(srcFile.isDirectory()){
            //在目的地下创建数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFile = new File(destFile,srcFileName);
            if(!newFile.exists()){
                newFile.mkdir();
            }
            //获取数据源File下的所有文件和目录
            File[] fileArr = srcFile.listFiles();
            //遍历数组
            for(File file :fileArr){
                copyFolder(file,newFile);
            }
        }else{
            //直接复制
            File newDestFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newDestFile);
        }

    }
    public static void copyFile(File srcFile,File destFile)throws IOException{
        //创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        //创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        //读写数据，复制文件
        byte [] bys = new byte [1024];
        int len;
        while((len = bis.read()) != -1){
            bos.write(bys,0,len);
        }

        //释放资源
        bis.close();
        bos.close();
    }
}
