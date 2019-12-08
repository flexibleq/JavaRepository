package com.fxq.homework.day08.subject05;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//键盘录入一个文件夹路径,统计该文件夹(不包含子文件夹)中每种类型的文件及个数,
//注意:用文件类型("java","txt"...)作为key,用个数作为value,
//放入到map集合中,并按照如下格式打印map集合中的内容
//docx类型的文件有  1 个
//java类型的文件有  24 个
//txt类型的文件有  10 个
public class FileDemo {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        //创建集合对象
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        System.out.println("请输入文件夹路径：");
        File srcFile = null;
        while (true) {
            String path = sc.nextLine();
            srcFile = new File(path);
            if (!srcFile.exists()) {
                System.out.println("该路径不存在，请重新输入：");
            } else if (srcFile.isFile()) {
                System.out.println("请输入文件夹路径：");
            } else {
                break;
            }
        }
        File[] files = srcFile.listFiles();
       /* hm.put("java", 0);
        hm.put("docx", 0);
        hm.put("txt", 0);
        hm.put("doc",0);
        hm.put("xls",0);
        hm.put("ppt",0);
        hm.put("pptx",0);
        hm.put("zip",0);
        hm.put("rar",0);
        hm.put("bmp",0);*/
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String[] strArr = file.getName().split("\\.");
                    String key = strArr[strArr.length-1];
                    Integer value = hm.get(key);
                    if(hm.containsKey(key)){
                        hm.put(key,++value);
                    }else{
                        hm.put(key,1);
                    }
                }
            }
        }

        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        for (Map.Entry<String, Integer> me : entrySet) {
            String key = me.getKey();
            Integer value = me.getValue();
            System.out.println(key + "类型的文件有" + value + "个");
        }

    }
}
