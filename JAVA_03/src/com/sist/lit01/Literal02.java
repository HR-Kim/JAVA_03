package com.sist.lit01;

public class Literal02 {
/**
 * ���ڿ� ���ͷ�(String literal)
 * : " "��� ǥ���Ѵ�.
 * ex) "Hello"
 *     "�ȳ��ϼ���"
 * 
 * @param args
 */
	public static void main(String[] args) {
		String str01 = "";//
		String name=new String("Java");
		System.out.println("name="+name);
		
		//���ڿ� ����
		String str02 = "Java" + " J World";
		System.out.println("str02="+str02);
		
		String str03 = str02 + 8.0;
		System.out.println("str03="+str03);

	}

}
