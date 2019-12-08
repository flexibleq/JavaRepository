package com.map.hashmapincludearraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* 需求：创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String
* 值是ArrayList，每一个ArrayList的元素是String，并遍历
*思路：
* 1.创建Hash Map集合
* 2.创建ArrayList集合，并添加元素
* 3.把ArrayList作为元素添加到HashMap集合
* 4.遍历HashMap集合
* */
public class HashMapIncludeArrayList {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
        //创建ArrayList集合，并添加元素
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("诸葛亮");
        array1.add("赵云");

        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("唐僧");
        array2.add("孙悟空");

        ArrayList<String> array3 = new ArrayList<String>();
        array3.add("武松");
        array3.add("鲁智深");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义",array1);
        hm.put("西游记",array2);
        hm.put("水浒传",array3);

        //遍历集合
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            System.out.println(key);
            ArrayList<String> array = hm.get(key);
            for(String s:array){
                System.out.println(s);
            }
        }

        //遍历集合
        Set<Map.Entry<String, ArrayList<String>>> entrySet = hm.entrySet();
        for(Map.Entry<String,ArrayList<String>> me :entrySet){
            String key = me.getKey();
            System.out.println(key);
            ArrayList<String> value = me.getValue();
            for(String s:value){
                System.out.println(s);
            }
        }
    }
}
