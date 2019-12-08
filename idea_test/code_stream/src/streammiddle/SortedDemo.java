package streammiddle;

import java.util.ArrayList;

/*
* Stream<T> sorted():返回由此流的元素组成的流，根据自然顺序排序
* Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
* Comparator接口中的方法 int compare(T o1,T o2)
* */
public class SortedDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("javase");
        array.add("javaee");
        array.add("javame");

        //需求1：按照字母顺序把数据输出在控制台
        //array.stream().sorted().forEach(System.out::println);
        //需求2：按照字符串长度把数据输出在控制台
        array.stream().sorted((s1,s2)->{
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2) : num;
            return num2;
        }).forEach(System.out::println);
    }
}
