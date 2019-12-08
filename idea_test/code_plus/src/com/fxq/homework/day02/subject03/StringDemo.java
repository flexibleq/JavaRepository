package com.fxq.homework.day02.subject03;

public class StringDemo {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "good good study day day up";
        //创建一个字符串数组接收从空格划分的字符串
        String[] strArr = s.split(" ");
        //创建一个StringBuilder对象
        StringBuilder sb = new StringBuilder();
        //创建一个StringBuilder数组存储String数组中的元素
        StringBuilder [] sbArr = new StringBuilder[strArr.length];
        //创建一个字符数组存储首字母
        char [] chArr = new char[strArr.length];
        //遍历字符串数组
        for(int i=0;i<strArr.length;i++){
            //将每个字符串元素的首字母取出
            chArr[i] = strArr[i].charAt(0);
            //判断首字母是否为小写，是则转换为大写
            if(chArr[i]>='a' && chArr[i]<='z') {
                //将首字母转为大写
                chArr[i] -= 32;
            }
            //通过构造方法将String数组转化为StringBuilder数组
            sbArr[i] = new StringBuilder(strArr[i]);
            //通过StringBuilder类的setCharAt()用大写首字母将小写首字母替换
            sbArr[i].setCharAt(0,chArr[i]);
            //将StringBuilder数组中的元素添加到StringBuilder字符串中
            sb.append(sbArr[i]).append(" ");
        }
        //将StringBuilder转化为String
        String ss = sb.toString();
        System.out.println(ss);
    }
}
