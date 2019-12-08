package streammiddle;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
* static <T> Stream<T> concat(Stream a,Stream b):合并a和b两个流为一个流
* Stream<T> distinct():返回由该流的不同元素(根据Object.equals(Object))组成的流
* */
public class ConcatDistinctDemo {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> array = new ArrayList<String>();
        array.add("林青霞");
        array.add("张曼玉");
        array.add("王祖贤");
        array.add("柳岩");
        array.add("张敏");
        array.add("张无忌");
        
        //需求1：取前四个数据组成一个流
        Stream<String> s1 = array.stream().limit(4);
        //需求2：跳过2个数据组成一个流
        Stream<String> s2 = array.stream().skip(2);
        //需求3：合并需求1和需求2得到的流，并把结果在控制台输出
//        Stream.concat(s1,s2).forEach(System.out::println);
        //需求4：合并需求1和需求2得到的流，并把结果在控制台输出，要求字符串元素不能重复
        Stream.concat(s1,s2).distinct().forEach(System.out::println);
    }
}
