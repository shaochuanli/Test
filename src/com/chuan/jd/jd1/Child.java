package com.chuan.jd.jd1;

/**
 * Created by chuan on 16/1/22.
 */
class Child extends Base{
	public Child() {
		System.out.println("Child.Constructor");
	}
	
	@Override
    void amethod(){
        System.out.println("Child.Call");
    }
}
