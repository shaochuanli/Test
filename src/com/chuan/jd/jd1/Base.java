package com.chuan.jd.jd1;

/**
 * Created by chuan on 16/1/22.
 */
class Base {

    void amethod(){
        System.out.println("Base.Call");
    }

    Base(){
        amethod();
        System.out.println("Bacse.Constructor");
    }
}


