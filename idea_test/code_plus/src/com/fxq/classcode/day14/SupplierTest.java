package com.fxq.classcode.day14;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {1,45,65,32,31,23,76};
        getMax(()->{
            int max = arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;
        });

    }
    public static void getMax(Supplier<Integer> sup){
        Integer i = sup.get();
        System.out.println(i);
    }
}
