package streamdemo;

import java.util.ArrayList;

/*
 * 创建一个集合，存储多个字符串元素
 * 把集合中所有以“张”开头的元素存储到一个新的集合
 * 把“张”开头的集合中的长度为3的元素存储到一个新的集合
 * 遍历上一步得到的集合
 * */
public class StreamDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("张三丰");
        array.add("张无忌");
        array.add("张翠山");
        array.add("风清扬");
        array.add("令狐冲");
        array.add("张狂");
        //创建第二个集合对象
        ArrayList<String> zhangList = new ArrayList<String>();
        for (String s : array) {
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }
        //创建第三个集合
        ArrayList<String> threeList = new ArrayList<String>();
        for (String ss : zhangList) {
            if (ss.length() == 3) {
                threeList.add(ss);
            }
        }
        for (String sss : threeList) {
            System.out.println(sss);
        }

        System.out.println("------------------");
        array.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(s-> System.out.println(s));
    }
}
