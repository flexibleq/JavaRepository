package com.fxq.homework.day08.subject02;

import java.io.File;

//删除指定的目录（包含子目录）
// 注意:切记别删除有用的数据,"概不负责哟"
public class FileDelete {
    public static void main(String[] args) {
        //创建File对象
        File srcFile = new File("F:\\iostream\\JavaWeb");
        deleteFile(srcFile);
    }

    public static void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {
           for(File f:files){
               if(f.isFile()){
                   f.delete();
               }else{
                   deleteFile(f);
               }
           }
           file.delete();
        }
    }

}

