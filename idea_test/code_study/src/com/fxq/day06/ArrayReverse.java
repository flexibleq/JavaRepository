package com.fxq.day06;

import java.util.Scanner;
//1.键盘录入6个int类型的数据存数数组arr中
//2.将arr数组中的内容反转
//3.将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
//4.最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
//5.打印最终的数组(实现了1-4步之后的数组)
//6.如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建一个数组
        int[] arr = new int[10];

        //遍历数组为其赋值，键盘录入6个int类型的数据存数数组arr中
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }
        //打印反转前的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //调用反转方法
        reverse(arr);
        //打印反转后数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //调用交换奇数索引元素方法
        exchange(arr);
        //打印交换后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //调用交换首尾奇数索引元素方法
        firstLast(arr);
        //打印交换后数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    //将arr数组中的内容反转
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
    //将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
    public static void exchange(int[] arr) {
        for (int i = 0; i < arr.length-2; i++) {
            //索引为奇数则交换当前索引元素和当前索引加2元素的值
            if (i % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[i+2];
                arr[i+2] = temp;
            }
        }
    }
    //最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
    public static void firstLast(int arr[]){
        //判断数组长度是奇数还是偶数，第一个奇数索引就是1
        //若长度为偶数，则最后一个奇数索引则为长度-1
        if(arr.length %2 == 0){
            int temp = arr[1];
            arr[1] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }else{//若长度为奇数，则最后一个奇数索引为长度-2
            int temp = arr[1];
            arr[1] = arr[arr.length-2];
            arr[arr.length-2] = temp;
        }
    }
}
