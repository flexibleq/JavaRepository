package com.xingcan;

public class InterOperator {
    public void useInter(Inter i){
        i.inter();
    }

    public Inter getInter(){
        Inter i = new InterImpl();
        return i;
    }
}
