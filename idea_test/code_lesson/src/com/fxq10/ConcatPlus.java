package com.fxq10;

public class ConcatPlus {
    public static void main(String[] args) {
        ArrayReverse a = new ArrayReverse();
        a.aaa();
//        ArrayReverse.arrayReverse();
       String s;
       //s = "fjls";

        int [] arr = {1,2,3};
        String concat = concat(arr);
        System.out.println("result:"+concat);

    }

    public static String concat(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");

        String s = sb.toString();
        return s;
    }
}
