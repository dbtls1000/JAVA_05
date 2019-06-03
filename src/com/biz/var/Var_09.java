package com.biz.var;

public class Var_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a1 = 'a';
		char a2 = 'b';
		// 문자a에 ASCII코드와 문자b의 ASCII코드 값을 덧셈 연산
		System.out.println(a1 + a2);

		String s1 = "Korea";
		String s2 = "대한민국";
		// 문자열의 연결
		System.out.println(s1 + s2);
		
		
		
		
		//만약 i가 9인경우
		int num = 100;
		for (int i = 2; i < num; i++) {
			
			//index가 3이되는경우
			//조건문이 true가 되고
			// 9%4이후는 계산할 필요가 없다.
			int index = 2;
			for (index = 2; index < i; index++) {
				if(i % index ==0)
					break;
				}
			// break 이후 실행되는 곳	
			// i값이 소수이면
			// index >= i
			// i값이 소수가 아니면
			// i > index
			if(index >= i) {
				System.out.println(i + "는 소수입니다");
			}

		}
		
	}

}
