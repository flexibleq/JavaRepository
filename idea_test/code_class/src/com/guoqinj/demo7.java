package com.guoqinj;

import java.util.HashMap;
import java.util.Set;

//2.取出一个字符串中字母出现的次数。如：字符串：”abcdekka27qoq”，输出格式为：a(2)b(1)k(2）
public class demo7 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "abcdekka27qoqABCD";
        //创建Map集合
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >='a' && s.charAt(i) <='z') || (s.charAt(i) >='A' && s.charAt(i) <='Z')) {
                Integer value = hm.get(s.charAt(i));
                if (value == null) {
                    hm.put(s.charAt(i), 1);
                } else {
                    hm.put(s.charAt(i), ++value);
                }
            }
        }

        //遍历集合
        Set<Character> chs = hm.keySet();
        for (Character ch : chs) {
            Integer value = hm.get(ch);
            System.out.println(ch+"("+value+")");
        }

    }
}
