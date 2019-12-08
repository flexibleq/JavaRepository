package com.fxq.classcode.day08;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        //创建File对象
        File f = new File("F:\\iostream");
        getAllFile(f);

    }
    public static void getAllFile(File f){
        File[] files = f.listFiles();
        if(files != null){
            for(File file : files){
                if(file.isDirectory()){
                    getAllFile(file);
                }else{
                    System.out.println(file.getName());
                }
            }
        }
    }
}
