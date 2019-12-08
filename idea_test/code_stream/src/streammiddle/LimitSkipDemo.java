package streammiddle;

import java.util.ArrayList;

/*
* Stream<T> limit(long maxSize):
* 返回此流中元素组成的流，截取前指定参数个数的数据
* Stream<T> skip(long n):
* 跳过指定参数个数的数据，返回由该流剩余元素组成的流
* */
public class LimitSkipDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("林青霞");
        array.add("张曼玉");
        array.add("王祖贤");
        array.add("柳岩");
        array.add("张敏");
        array.add("张无忌");
     //需求1：取前三个数据在控制台输出
        array.stream().limit(3).forEach(System.out::println);
        System.out.println("----------------");
     //需求2：跳过3个元素，把剩下的元素在控制台输出
        array.stream().skip(3).forEach(System.out::println);
        System.out.println("----------------");
     //需求3：跳过2个元素，把剩下的元素中前2个元素在控制台输出
        array.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
