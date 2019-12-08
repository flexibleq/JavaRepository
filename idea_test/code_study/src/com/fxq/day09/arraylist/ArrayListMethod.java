package com.fxq.day09.arraylist;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("小蜜蜂");
        array.add("小蜂蜜");
        array.add("飞呀飞");
        //删除元素
//        System.out.println("小蜜蜂");
//        System.out.println(array.remove(0));

        //修改元素
//        System.out.println(array.set(1,"飞不动"));

        //获取元素
//        System.out.println(array.get(2));

        //返回集合中元素的个数
        System.out.println(array.size());
        System.out.println(array);
    }

}
