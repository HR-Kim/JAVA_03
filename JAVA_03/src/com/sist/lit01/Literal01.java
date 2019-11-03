package com.sist.lit01;

public class Literal01 {
	/**
	 * 한국어,영어도 다양한 문자들의 조합으로 이루어진것과 마찬가지로 
	 * Java언어도 단어의 조합으로 구성된다. 그
	 * 특정한 의미를 가진 문자를 java에서는 토큰(token)
	 * -토큰종류
	 * 1. 리터럴
	 * 2. 키워드
	 * 3. 식별자
	 * 4. 연산자
	 * 5. 구분자(쉼표)
	 * @param args
	 */
	public static void main(String[] args) {
		
		long big = 100_000_000_000L;
		long big01 = 100000000000l;
		System.out.println("big="+big);

		float pi = 3.14f;
		System.out.println("pi="+pi);
		
		double rate = 1.618;
		System.out.println("rate="+rate);
		
		double literD01 = 10.;
		double literD02 = 10.0;		
		System.out.println("literD01="+literD01);//literD01=10.0
		System.out.println("literD02="+literD02);//literD02=10.0
		
		double literD03 = 1e2;
		double literD04 = 100.0;
		double literD05 = 1e-2;
		System.out.println("literD03="+literD03);//literD03=100.0
		System.out.println("literD04="+literD04);//literD04=100.0		
		System.out.println("literD05="+literD05);//literD05=0.01
		
		//float f = 3.14; Double을 float에 할당 할수 없다.
		//The literal 0x123456789 of type int is out of range
		//int   i = 0x123456789; 
		
		//char: 'A', String: "abc"
		char ch ='J';
		String str = "J";
		
		System.out.println("ch="+ch);
		System.out.println("str="+str);
		
		//char String초기화
		char ch01 = ' ';//char는 space필요.
		String str01 = "";//
		String name=new String("Java");
		System.out.println("name="+name);
		
		//문자열 결합
		String str02 = "Java" + " J World";
		System.out.println("str02="+str02);
		
		String str03 = str02 + 8.0;
		System.out.println("str03="+str03);
	}

}
