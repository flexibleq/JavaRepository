package com.fxq.day05;
/*1、定义一个方法
public static ? print(int[] arr)功能：遍历数组所有元素
2.定义一个方法
public static ? fill(int[] arr,int value)功能:将数组arr中的所有元素的值改为value
比如:调用方法如下 fill(arr , 23);最终遍历数组,该数组里的元素都是 23
3.定义一个方法
public static ? equals(int[] arr1,int[] arr2)
功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)*/
public class Subject02 {
    public static void main(String[] args) {
        //创建一个数组
        int [] arr = {1,2,3,4,5};
        int [] arr1 = {1,2,3,4,5};
        boolean result = equals(arr, arr1);
        print(arr);
        System.out.println("-------------");
        fill(arr,5);
        System.out.println("-------------");
        fill(arr,0,3,8);
        System.out.println("-------------");
        int equals = equals(arr1, 4);
        System.out.println(equals);
        System.out.println("-------------");
        System.out.println(result);
    }
    //遍历数组所有元素
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //将数组arr中的所有元素的值改为value
    public static void fill(int[] arr,int value){
        //遍历数组修改元素值
        for(int i=0;i<arr.length;i++){
            arr[i] = value;
            System.out.println(arr[i]);
        }
    }
    //比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
    public static boolean equals(int[] arr1,int[] arr2){
        //如果数组长度不同，那么两个数组一定不相等
        if(arr1.length != arr2.length){
            return false;
        }
        //遍历比较两个数组中的对应索引上的元素，如果不同返回false
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        //其他情况即相等
        return true;
    }
    //将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)对应的值改为value
    public static void fill(int[] arr,int fromIndex,int toIndex,int value){
        //遍历该区间，修改元素值
        for(int i=fromIndex;i<toIndex;i++){
            arr[i] = value;
        }
        //遍历修改之后的数组
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //找value里的值在数组中的索引,如果没有找到请返回 -1
    public static int equals(int[] arr,int value){
        //定义索引变量初始值为-1
        int index = -1;
        //遍历数组
        for(int i=0;i<arr.length;i++){
            //如果找到将索引的值赋给索引变量，退出循环
            if(value == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }

}
