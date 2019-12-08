package com.io.diguifile;

import java.io.File;

public class DiGuiFIle {
    public static void main(String[] args) {
        //根据给定的路径创建一个File对象
        File srcFile = new File("F:\\iostream");

        //调用方法
        getAllFilePath(srcFile);
    }
    public static void getAllFilePath(File f){
        //获取给定的File目录下所有的文件或者目录的File数组
        File[] fileArray = f.listFiles();
        //遍历该File数组，得到每一个File对象
        if(fileArray != null){
            for(File ff:fileArray){
                if(ff.isDirectory()){
                    getAllFilePath(ff);
                }else{
                    System.out.println(ff.getAbsolutePath());
                }
            }
        }

    }
}
