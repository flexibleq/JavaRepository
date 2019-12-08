package streammiddle;

import java.util.ArrayList;

/*
* Stream<T> filter (Predicate predicate)用于对流中的数据进行过滤
* Predicate接口中的方法boolean test(T t):对给定的参数进行判断，返回一个布尔值
* */
public class StreamFilterDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        array.add("张三丰");
        array.add("张曼玉");
        array.add("王祖贤");
        array.add("柳岩");
        array.add("张敏");
        array.add("张无忌");

        //需求1：把list集合中以张开头的元素在控制台输出
        array.stream().filter(s->s.startsWith("张")).forEach(System.out::println);
        System.out.println("------------------");
        //需求2：把list集合中长度为3的元素在控制台输出
        array.stream().filter(s->s.length() == 3).forEach(System.out::println);
        System.out.println("------------------");
        //需求3：把list集合中以张开头的长度为3的元素在控制台输出
        array.stream().filter(s->s.startsWith("张")).filter(s->s.length() == 3).forEach(System.out::println);
    }
}
