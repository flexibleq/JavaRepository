package com.it;

import com.fxq03.MyService;

import java.util.ServiceLoader;

public class Test01 {
    public static void main(String[] args) {
        //加载服务
        ServiceLoader<MyService> myServices = ServiceLoader.load(MyService.class);
        //遍历服务
        for(MyService my :myServices){
            my.service();
        }
    }
}
