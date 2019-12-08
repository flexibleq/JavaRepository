package com.fxq.homework.day03.subject05;

public class Test {
    public static void main(String[] args) {
        A a = new A();

        a.methodA(new InterA() {
            @Override
            public void showA() {
            }
        });

        InterA ia = new InterA() {
            @Override
            public void showA() {
            }
        };

        a.methodA(ia);
    }
}
