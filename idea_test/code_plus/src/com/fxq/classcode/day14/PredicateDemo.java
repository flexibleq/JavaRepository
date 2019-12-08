package com.fxq.classcode.day14;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        String[] strArr = {"林青霞,30", "柳岩,34", "张曼玉,35"};
        ArrayList<String> list = checkString(strArr, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 33);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> checkString(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();
        for (String s : str) {
            if (pre1.and(pre2).test(s)) {
                array.add(s);
            }
        }
        return array;
    }
}