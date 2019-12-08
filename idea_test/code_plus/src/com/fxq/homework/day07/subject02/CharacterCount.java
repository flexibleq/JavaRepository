package com.fxq.homework.day07.subject02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*(1)统计每个单词出现的次数
        (2)有如下字符串"If you want to change your fate
         I think you must come to the dark horse to learn java"(用空格间隔)
        (3)打印格式：
        to=3
        think=1
        you=2
//........*/
public class CharacterCount {
    public static void main(String[] args) {
        //定义一个字符串
        String sentence = "If you want to change your fate I think you must come to the dark horse to learn java";
        //将字符串转化为字符串数组
        String[] words = sentence.split(" ");
        //创建集合对象
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        //遍历数组存储
        for(int i=0;i<words.length;i++){
            Integer value = hm.get(words[i]);
            if(value == null){
                hm.put(words[i],1);
            }else{
                hm.put(words[i],++value);
            }
        }
        //遍历集合
        //方式一
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            Integer value = hm.get(key);
            System.out.print(key+"="+value);
            System.out.println();
        }
        System.out.println("------------");
        //方式二
        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        for(Map.Entry<String,Integer> me:entrySet){
            String key = me.getKey();
            Integer value = me.getValue();
            System.out.println(key+"="+value);
        }
    }
}
