package com.fxq.homework.day07.subject04;

import java.util.*;

//定义一个泛型为String类型的List集合，
// 统计该集合中每个字符（注意，不是字符串）出现的次数。
//例如：集合中有”abc”、”bcd”两个元素，
//程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
public class ListCount {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("abc");
        list.add("bcd");
        //创建HashMap集合对象
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        //遍历数组
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            for(int j=0;j<s.length();j++){
                char key = s.charAt(j);
                Integer value = hm.get(key);
                if(value == null){
                    hm.put(key,1);
                }else{
                    hm.put(key,++value);
                }
            }
        }
        //遍历集合
        Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
        for(Map.Entry<Character,Integer> me:entrySet){
            Character key = me.getKey();
            Integer value = me.getValue();
            System.out.print(key+"="+value+",");
        }
    }
}
