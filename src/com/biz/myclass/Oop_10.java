package com.biz.myclass;

public class Oop_10 {

	public static void main(String[] args) {
		
		int ret = add(50,100);
		ret = Myclass_03.add(100,200);
		System.out.println(ret);
		
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
}
