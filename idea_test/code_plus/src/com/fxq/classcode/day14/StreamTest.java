package com.fxq.classcode.day14;

import java.util.ArrayList;

public class StreamTest {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("林青霞");
        array.add("吴京");
        array.add("张曼玉");
        array.add("张三丰");
        array.add("黄晓明");
        array.add("张臭");

        //生成流
        array.stream().filter(s->s.startsWith("张")).filter(s->s.length()>2).forEach(System.out::println);
    }
}
