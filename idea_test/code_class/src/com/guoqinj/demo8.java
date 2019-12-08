package com.guoqinj;

public class demo8 {
    public static void main(String[] args) {
        Task task = new Task();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    task.subMethod();


                }















            }
        }).start();

        for (int i = 0; i < 3; i++) {
            task.mainMethod();
        }
    }
}
