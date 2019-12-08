package com.generic.geneadvantage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Collection集合遍历存储字符串遍历

//好处：
//将运行时的错误提前到编译期
//避免强制类型转换
public class GenericDemo {
    public static void main(String[] args) {
       /* //不使用泛型
       //创建集合对象
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add(100);//ClassCastException

        Iterator it = c.iterator();
        while(it.hasNext()){
            String s =(String) it.next();
            System.out.println(s);
        }*/

       //使用泛型
        //创建集合对象
        Collection<String> c = new ArrayList<String>();
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //遍历
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
