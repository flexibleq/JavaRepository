package com.fxq.classcode.day10;

import java.io.*;

public class CopyFolder {
    public static void main(String[] args) throws IOException {
        //创建数据源目录文件对象
        File srcFolder = new File("F:\\iostream\\JavaSE");
        //获取数据源目录名称
        String srcFolderName = srcFolder.getName();
        //创建目的地文件对象
        File destFolder = new File("code_plus",srcFolderName);
        //判断目的地目录对应的File是否存在，若不存在，则创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }

        //获取数据源文件夹下的文件对象
        File[] files = srcFolder.listFiles();
        for(File file : files){
            String fileName = file.getName();
            File destFile = new File(destFolder,fileName);
            copyFolder(file,destFile);
        }
    }

    private static void copyFolder(File file, File destFile) throws IOException {
        //创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        //创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        //读写数据，复制文件
        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        //释放资源
        bis.close();
        bos.close();
    }
}
