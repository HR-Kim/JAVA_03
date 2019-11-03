package com.sist.lit01;

public class Literal02 {
/**
 * 문자열 리터럴(String literal)
 * : " "묶어서 표현한다.
 * ex) "Hello"
 *     "안녕하세요"
 * 
 * @param args
 */
	public static void main(String[] args) {
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
