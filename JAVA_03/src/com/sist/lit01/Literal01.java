package com.sist.lit01;

public class Literal01 {

	public static void main(String[] args) {
		long big = 100_000_000_000L;
		System.out.println("big="+big);

		float pi = 3.14f;
		System.out.println("pi="+pi);
		
		double rate = 1.618;
		System.out.println("rate="+rate);
		
		double literD01 = 10.;
		double literD02 = 10.0;		
		System.out.println("literD01="+literD01);
		System.out.println("literD02="+literD02);
		
		double literD03 = 1e2;
		double literD04 = 100.0;
		double literD05 = 1e-2;
		System.out.println("literD03="+literD03);
		System.out.println("literD04="+literD04);		
		System.out.println("literD05="+literD05);
		
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
