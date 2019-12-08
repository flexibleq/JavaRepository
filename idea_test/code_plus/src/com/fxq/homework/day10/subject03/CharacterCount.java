package com.fxq.homework.day10.subject03;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

//当前模块下有一个文本文件test.txt(里面的内容由数字和字母组成)
//	定义一个方法统计test.txt文件中所有字符出现的次数。
//	输出结果如下:
//	a出现10次
public class CharacterCount {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("code_plus\\test.txt"));
        int len;
        while((len = br.read()) != -1){
            //每次读取到的字符,最后会变成一个数字,需要把数字强转为 对应的字符
            char key = (char)len;
            if(key == '\r' || key == '\n'){
                continue;
            }
            //判断集合是否包含刚刚强转的字符
            if(hm.containsKey(key)){
                hm.put(key, hm.get(key)+1);
            }else{
                hm.put(key, 1);
            }
        }

        //a出现10次
        Set<Character> keys = hm.keySet();
        for (Character key : keys) {
            System.out.println(key+"出现"+hm.get(key)+"次");
        }
    }

}
