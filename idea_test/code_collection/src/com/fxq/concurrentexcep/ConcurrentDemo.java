package com.fxq.concurrentexcep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//并发修改异常
public class ConcurrentDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //获取迭代器对象
        Iterator<String> it = list.iterator();
        //遍历集合
        //并发修改异常
        /*while(it.hasNext()){
            String ss = it.next();//ConcurrentModificationException
            if(ss.equals( "hello")){
                list.add("javaee");
            }
        }
        System.out.println(list);*/
        //解决方法 使用for循环遍历
        for(int i=0;i<list.size();i++){
            String ss = list.get(i);
            if(ss.equals("hello") ){
                list.add("javaee");//添加在列表末尾
            }
        }
        System.out.println(list);
    }
}
