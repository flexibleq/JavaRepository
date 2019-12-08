package com.fxq.day06;

public class HundredChicken {
    public static void main(String[] args) {
        //第一层循环，用于表示鸡翁的范围
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int k = 100 - i - j;
                if (k % 3 == 0 && 5 * i + 3 * j + k / 3 == 100) {
                    System.out.println("鸡翁："+i+" \t鸡母："+j+" \t小鸡："+k);
                }
            }
        }
    }
}
