package com.set.hash;

public class HashCodeDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student("张三丰",99);
        //同一个对象多次调用hashcode（）方法返回的哈希值是相同的
        System.out.println(s.hashCode());//1967205423
        System.out.println(s.hashCode());//1967205423
        System.out.println("----------------");

        Student s1 = new Student("张三丰",99);
        //默认情况下，不同对象返回的哈希值是不同的
        //通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s1.hashCode());//42121758
        System.out.println("----------------");

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("world".hashCode());//113318802

        System.out.println("---------");
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
        System.out.println("的法律是".hashCode());//931417749
        System.out.println("未来".hashCode());//845179
        System.out.println("重地通话".hashCode());//1134577990
        System.out.println("通话重地".hashCode());//1134577990

    }
}
