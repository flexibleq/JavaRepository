package com.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;
//TreeSet集合特点：
//1.元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序
//具体排序方式取决于构造方法
//TreeSet():根据其元素的自然排序进行排序
//TreeSet(Comparator comparator):根据指定的比较器进行排序
//2.没有带索引的方法，所以不能使用普通for循环
//3.由于是set集合，所以不包含重复元素
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        //添加元素
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(60);
        treeSet.add(30);
        //自然排序

        treeSet.add(15);
        //遍历
        //迭代器遍历
        Iterator<Integer> it = treeSet.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println("---------");
        //增强for循环遍历
        for(Integer i:treeSet){
            System.out.println(i);
        }
    }
}
