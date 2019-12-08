package com.collections.doudizhu.doudizhudemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌

    思路：
        1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        2:往牌盒里面装牌
        3:洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        4:发牌，也就是遍历集合，给三个玩家发牌
        5:看牌，也就是三个玩家分别遍历自己的牌
 */
public class DoudizhuDemo {
    public static void main(String[] args) {
        //定义两个数组：花色，点数
        String [] colors = {"♦","♣","♥","♠"};
        String [] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> array = new ArrayList<String>();
        for(String color:colors){
            for(String number:numbers){
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");

        //洗牌
        Collections.shuffle(array);
        //发牌
        ArrayList<String> arrayZps = new ArrayList<String>();
        ArrayList<String> arrayWy = new ArrayList<String>();
        ArrayList<String> arrayLjh = new ArrayList<String>();
        ArrayList<String> arrayDp = new ArrayList<String>();

        //发牌
        for(int i=0;i<array.size();i++){
            String poker = array.get(i);
            if(i>=array.size()-3){
                arrayDp.add(poker);
            }else if(i % 3 == 0){
                arrayZps.add(poker);
            }else if(i % 3 == 1){
                arrayWy.add(poker);
            }else{
                arrayLjh.add(poker);
            }
        }

        //看牌
        lookPoker("张翩笙",arrayZps);
        lookPoker("王涌",arrayWy);
        lookPoker("吕俊豪",arrayLjh);
        lookPoker("底牌",arrayDp);
        //输出牌盒
        //System.out.println(array);
    }
    //看牌方法
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name+"玩家的牌是：");
        for(String s:array){
            System.out.print(" "+s);
        }
        System.out.println();
    }
}

