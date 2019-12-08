package streammiddle;

import java.util.ArrayList;

/*
* <R> Stream<R> map(Function mapper):返回由给定函数应用于此流的元素的结果组成的流
* Function接口中的方法   R apply(T t)
*
* IntStream mapToInt(ToIntFunction mapper):返回一个IntStream其中包含将给定函数应用于此流的元素的结果
* IntStream:表示原始int流
* ToIntFunction接口中的方法：int applyAsInt(T value)
* */
public class MapToIntDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("10");
        array.add("20");
        array.add("30");
        array.add("40");
        array.add("50");
        //将集合中的字符串数据转换为整数输出在控制台
        array.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);

        //将集合中的字符串数据转换为整数并求和再输出
        int sum = array.stream().mapToInt(s -> Integer.parseInt(s)).sum();
        System.out.println(sum);
    }
}
