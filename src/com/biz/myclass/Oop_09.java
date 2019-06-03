package com.biz.myclass;

public class Oop_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass_02 mc = new Myclass_02();
		mc.num1 = 30;
		mc.num2 = 50;
		mc.add(); //멤버변수를 참조
		
		int ret = Integer.valueOf(mc.add(50,20));
		System.out.println(ret);
		
		System.out.println(mc.add(100,200));
		
		mc.times();
		mc.minus();
		
	}

}
