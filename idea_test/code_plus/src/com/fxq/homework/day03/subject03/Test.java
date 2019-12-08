package com.fxq.homework.day03.subject03;

import com.fxq.homework.day03.subject03.Play;

public class Test {
    public static void main(String[] args) {
       /*Play p =  new Play(){
            @Override
            public void playGame() {
                System.out.println("玩游戏");
            }
        };
       p.playGame();*/

        new Play(){
            @Override
            public void playGame() {
                System.out.println("玩游戏");
            }
        }.playGame();
    }


}
