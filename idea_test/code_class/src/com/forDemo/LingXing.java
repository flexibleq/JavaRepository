package com.forDemo;

public class LingXing {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<10-i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i1=1;i1<9;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(" ");
            }
            for(int k1=1;k1<2*(9-i1);k1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
