package com.fxq.day08.subject03;

import java.util.Random;

//定义String getStr()方法
//		功能描述：
//			获取长度为5的随机字符串
//			字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
//			英文字母和数字的顺序是随机的
public class StringRandom {
    public static void main(String[] args) {
        String s = getStr();
        System.out.println(s);
    }
    public static String getStr(){
        //创建随机数对象
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=65;i<91;i++){
            char c = (char)i;
            sb.append(c);
        }

        String ss = sb.toString();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<5;i++){
            int word = r.nextInt(26);
            for(int j=0;j<ss.length();j++) {
                char c = ss.charAt(word);
                sb1.append(c);
                break;
            }
        }

        int index = r.nextInt(5);
        char number =(char) (r.nextInt(10)+48);
        sb1.setCharAt(index,number);

        String s = sb1.toString();
        return s;
    }
    /*public static String getStr(){
        //创建随机数对象
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append(i);
        }
        for(int i=65;i<91;i++){
            char c = (char)i;
            sb.append(c);
        }

        for(int i=97;i<133;i++){
            char c = (char)i;
            sb.append(c);
        }




        char [] ch = new char [5];
        String s = sb.toString();
        System.out.println(s);

        int index1 = r.nextInt(5);
        for(int i=0;i<s.length();i++){
            int number = r.nextInt(10);
            ch[index1] = s.charAt(number);
            break;
        }
        for(int i=0;i<s.length();i++){
            for(int i1=0;i1<5;i1++) {
                int index = r.nextInt(52)+10;
                 if (i1 == index1) {
                    continue;
                 } else {
                     ch[i1] =s.charAt(index);
                }
             }
        }

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
       String sss = new String(ch);
        return sss;

    }*/
}
