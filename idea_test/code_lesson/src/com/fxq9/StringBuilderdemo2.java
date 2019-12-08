package com.fxq9;

public class StringBuilderdemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        String s = sb.toString();
        System.out.println("s:"+s);

        String s1 = "helloworld";
        StringBuilder sb2 = new StringBuilder(s1);
        System.out.println("sb2:"+sb2);
    }
}
