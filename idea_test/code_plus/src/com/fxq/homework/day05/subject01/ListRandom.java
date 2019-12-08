package com.fxq.homework.day05.subject01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//(1)生成10个1至100之间的随机整数(不能重复)，存入一个List集合(可以先不使用泛型，泛型明天讲)
//	(2)编写方法对List集合进行排序,禁用Collections.sort方法和TreeSet
//	(2)然后利用迭代器遍历集合元素并输出
//	(3)如：15 18 20 40 46 60 65 70 75 91
public class ListRandom {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<Integer>();
        //创建随机数对象
        Random r = new Random();
        //循环十次
        for (int i = 0; i < 10; i++) {
            //定义标记并赋初值为false，表示没有重复
            boolean flag = false;
            //产生一个1-100的随机数
            int num = r.nextInt(100) + 1;
            //如果有重复进入while循环
            while (!flag) {
                //改变标记值
                flag = true;
                //遍历集合判断是否有元素与num相同
                for (int j = 0; j < i; j++) {
                    if (num == list.get(j)) {
                        //如果有，将标记值赋为false
                        flag = false;
                        //产生一个新的随机数，因为标记值为false，所以会进入下一次循环判断是否有相同
                        num = r.nextInt(100) + 1;
                    }
                }
            }
            //如果从while循环中跳出，则表示该随机数在集合中不曾出现过，将其添加入集合
            list.add(num);
        }
        //遍历排序前的集合
        //增强for循环遍历
        for(Integer i:list){
            System.out.print(i+" ");
        }

        System.out.println();

        //调用排序方法
        listSort(list);

        //遍历排序后的集合
        //迭代器方式
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.print(i+" ");
        }

    }
    //)编写方法对List集合进行排序,
    public static void listSort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                   list.add(j+2,list.get(j));
                   list.remove(j);
                }
            }
        }
    }
}
