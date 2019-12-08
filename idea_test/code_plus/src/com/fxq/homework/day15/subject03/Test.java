package com.fxq.homework.day15.subject03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//1.创建一个ArrayList集合对象名为 list,泛型为Integer类型,随机生成10个整数添加到集合
//	将集合的元素进行排序，且遍历出每一个元素
//
//	2.请问，有办法向对象名为 list的集合 中添加String类型的对象？
//		若不能，请说明原因
//		否则，请代码实现
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合对象
        ArrayList<Integer> list = new ArrayList<Integer>();
        //创建随机数对象
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            list.add(num);
        }
        Collections.sort(list);
        for(int i:list){
            System.out.print(i+" ");
        }
        //获取Class对象
        Class<? extends ArrayList> c = list.getClass();
        //获取成员方法
        Method m = c.getMethod("add", Object.class);
        m.invoke(list,"hello");
        m.invoke(list,"world");
        m.invoke(list,"java");
        System.out.println();
        System.out.println(list);
    }
}
