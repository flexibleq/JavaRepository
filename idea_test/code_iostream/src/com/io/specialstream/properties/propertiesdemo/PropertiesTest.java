package com.io.specialstream.properties.propertiesdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException{
        //创建集合对象
        Properties prop = new Properties();
        FileReader fr = new FileReader("code_iostream\\number.txt");
        prop.load(fr);
        fr.close();
        String count = prop.getProperty("count");
        int i = Integer.parseInt(count);
        if(i>=3){
            System.out.println("游戏试玩已结束，想玩请充值");
        }else{
            GuessNumber.guessNumber();
            i++;
            prop.setProperty("count",String.valueOf(i));
            FileWriter fw = new FileWriter("code_iostream\\number.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
