package com.fxq.homework.day05.subject05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListTest {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> list = new ArrayList<String>();
        //添加元素
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list,"a"));
        System.out.println("b:"+listTest(list,"b"));
        System.out.println("c:"+listTest(list,"c"));
        System.out.println("xxx:"+listTest(list,"xxx"));


    }

    public static int listTest(Collection<String> list,String s){
        int count = 0;
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String ss = it.next();
            if(ss.equals(s)){
                count++;
            }
        }
        return count;
    }
}
