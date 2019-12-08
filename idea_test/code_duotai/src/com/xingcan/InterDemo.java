package com.xingcan;

public class InterDemo {
    public static void main(String[] args) {
        InterOperator io = new InterOperator();
        Inter i = new InterImpl();
        io.useInter(i);
        i.inter();
        Inter iii = io.getInter();
        iii.inter();
    }
}
