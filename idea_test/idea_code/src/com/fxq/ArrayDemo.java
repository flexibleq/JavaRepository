package com.fxq;

public class ArrayDemo {
    public static void main(String[] args) {
//        int [] arr;
        int [] arr1 = new int[3];
        int [] arr2 = new int[3];
        int [] arr3 = arr2;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("-------------");

        arr1[0] = 12;
        arr1[1] = 34;
        arr1[2] = 56;

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("-------------");

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------------");

        arr2[0] = 55;
        arr2[1] = 78;
        arr2[2] = 90;

        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------------");

        arr3[0] = 100;
        arr3[1] = 200;
        arr3[2] = 300;

        System.out.println(arr2[0]);
        System.out.println(arr3[1]);
        System.out.println(arr2[2]);
        System.out.println("-------------");

        arr2[0] = 500;
        System.out.println(arr3[0]);
        System.out.println(arr3);
        //任何一个数组修改了元素值，另一个数组访问的值也是被修改的
        System.out.println("-------------");

        int [] arr4 = new int[] {1,2,3};

        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        System.out.println("-------------");

        int [] arr5 =  {78868,5,12,34,56,4,778,5623,342,3,32,543,};
        int max = arr5[0];
        for(int i=1;i<arr5.length;i++)
        {
            if(max<arr5[i]) {
                max = arr5[i];
            }
        }
        System.out.println(max);
    }
}
