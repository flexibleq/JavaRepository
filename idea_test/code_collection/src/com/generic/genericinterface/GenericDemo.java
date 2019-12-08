package com.generic.genericinterface;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> gs = new GenericImpl<String>();
        gs.show("hello");

        Generic<Integer> gi = new GenericImpl<Integer>();
        gi.show(100);

        Generic<Boolean> gb = new GenericImpl<Boolean>();
        gb.show(true);

        Generic<Character> gc = new GenericImpl<Character>();
        gc.show('I');
    }
}
