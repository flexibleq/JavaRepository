package com.fxq.classcode.day07;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("all")
public class HashMapCharacter {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //创建HashMap集合对象
        TreeMap<Character,Integer> hm = new TreeMap<Character, Integer>();

        //遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            Integer value = hm.get(c);
            if(value == null){
                hm.put(c,1);
            }else{
                hm.put(c,++value);
            }
        }
        //遍历集合
        Set<Character> keySet = hm.keySet();
        StringBuilder sb = new StringBuilder();
        for(char c:keySet){
            Integer count = hm.get(c);
            sb.append(c).append("(").append(count).append(")");
        }
        System.out.print(sb.toString());

    }
}
