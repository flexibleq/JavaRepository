package com.io.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
* 编码：
* byte[] getBytes():使用平台的默认字符集将该String编码为一系列字节
* 将结果存储到新的字节数组
* byte[] getBytes(String charSetName):使用指定的字符集将该String编码为一系列字节
* 将结果存储到新的字节数组中
* 解码：
* String(byte [] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
* String(byte[] bytes，String charSetName):通过指定的字符集解码指定的字节数组来构造新的String
* */
public class CharSetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "中国";
        // byte[] getBytes():使用平台的默认字符集将该String编码为一系列字节
        //byte[] bys = s.getBytes();//[-28, -72, -83, -27, -101, -67]
        //byte[] getBytes(String charSetName):使用指定的字符集将该String编码为一系列字节
        //byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

        //String(byte [] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的String
        String ss = new String(bys);

        //String(byte[] bytes，String charSetName):通过指定的字符集解码指定的字节数组来构造新的String
       //String sss = new String(bys,"GBK");//涓浗
        String sss = new String(bys,"GBK");//中国
        System.out.println(sss);
    }
}
