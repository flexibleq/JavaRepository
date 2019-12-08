package zhuangxiang;

public class IntegerDemo {
    //装箱：把基本数据类型转换为对应的包装类型
    //拆箱：把包装类类型转换为对应的基本数据类型

    public static void main(String[] args) {
        //装箱
        Integer i = Integer.valueOf(100);
        //自动装箱
        Integer ii = 100;//底层也做了Integer.valueOf(100);
        System.out.println(ii);

        //拆箱
        int i1 = ii.intValue() + 100;
        System.out.println(i1);

        //自动拆箱
         ii += 900;
        System.out.println(i1);

    }
}
