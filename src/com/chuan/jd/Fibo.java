package com.chuan.jd;

public class Fibo {

	public static int Fibo(int num){
		if(num == 0){
			return 0;
		}
		if(num==1){
			return 1;
		}
		return Fibo(num-1) + Fibo(num-2);
	}
	
	public static void main(String[] args) {
		System.out.println(Fibo(4));
	}
}
