package com.biz.myclass;

public class Oop_03 {
	
	// java 프로젝트의 진입점 method라고 한다.
	// 프로젝트를 작성하고 실햇을 했을때 제일 먼저
	// 작동되는 명령어 세트
	public static void main(String[] args) {
		// Oop_03과 PrimeClass가 같은 package내에 있으면
		// import하지않아도 사용할 수 있다.
		PrimeClass pc = new PrimeClass();
		pc.prime();
		
		
	}

}
