package com.fxq.homework.day02.subject01;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        USB u = new Mouse();
        c.startUp();
        c.useUsb(u);
        u = new KeyBoard();
        c.useUsb(u);
        c.shutDown();
    }
}
