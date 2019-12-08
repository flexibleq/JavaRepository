package com.map.HashMapCharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
//  - 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
//思路：
//1.键盘录入一个字符串
//2.创建HashMap集合，键是Character,值是Integer
//3.遍历字符串，得到每一个字符
//4.拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
//如果返回值为null，说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
//如果返回值不是null,说明该字符在Hash Map集合中存在，把该值加1，然后重新存储该字符和对应的值
//5.遍历HashMap集合，得到键和值，按要求进行拼接
//6.输出结果
public class HashMapCharacter {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //创建HashMap集合，键是Character,值是Integer
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        //遍历字符串，得到每一个字符
        for(int i=0;i<line.length();i++){
            char c = line.charAt(i);
            //拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            Integer value = hm.get(c);
            if(value == null){
                hm.put(c,1);
            }else{
                hm.put(c,++value);
            }
        }
        //遍历HashMap集合，得到键和值，按要求进行拼接
        //遍历
        //方式一
        Set<Character> keySet = hm.keySet();
        StringBuilder sb = new StringBuilder();
        for(Character key:keySet){
            Integer value = hm.get(key);
           sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
        System.out.println("-------------");
        //方式二
       /* Set<Map.Entry<Character, Integer>> entrySet = hm.entrySet();
        for(Map.Entry<Character,Integer> me:entrySet){
            Character key = me.getKey();
            Integer value = me.getValue();
            sb.append(key).append("(").append(value).append(")");
        }
        String consequence = sb.toString();
        System.out.println(consequence);*/
    }
}
