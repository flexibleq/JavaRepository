package com.fxq.classcode.day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
@SuppressWarnings("all")
public class HashMapIncludeArrayList {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
        //创建ArrayList集合对象
        ArrayList<String> sgyy = new ArrayList<String>();
        //添加元素
        sgyy.add("诸葛亮");
        sgyy.add("赵云");

        ArrayList<String> xyj= new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");

        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");

        //将ArrayList集合对象添加到HashMap中
        hm.put("三国演义",sgyy);
        hm.put("西游记",xyj);
        hm.put("水浒传",shz);

        //遍历集合
        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            System.out.println(key);
            ArrayList<String> values = hm.get(key);
            for(String value:values){
                System.out.println("\t"+value);
            }
        }
    }
}
