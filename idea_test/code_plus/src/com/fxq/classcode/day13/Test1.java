package com.fxq.classcode.day13;

public class Test1 {
    public static void main(String[] args) {
        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("张臭臭爱吃零食");
            }
        });

        //lambda表达式
        useEatable(() -> {
            System.out.println("张臭臭不学习");
        });

        useAddable((int a, int b) -> {
            return a + b;
        });
    }

    public static void useEatable(Eatable e) {
        e.eat();
    }

    public static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
