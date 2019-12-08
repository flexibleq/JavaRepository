package com.fxq.Test.Test01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Singer> array = new ArrayList<Singer>();
        //创建Singer对象
        Singer s1 = new Singer("刘德华",25,"打篮球");
        Singer s2 = new Singer("张学友",35,"游泳");
        Singer s3 = new Singer("郭富城",19,"踢足球");
        Singer s4 = new Singer("黎明",18,"击剑");
        //添加元素
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getAge() > 30){
                array.get(i).setLike("打保龄球");
            }
        }

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).getAge() < 20){
                array.remove(i);
                i--;
            }

        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName()+","+array.get(i).getAge()+","+array.get(i).getLike());
        }
    }
}
