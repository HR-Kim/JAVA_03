package com.sist.keyin04;

import java.util.Scanner;


/**
 * KeyBoard�Է� ó��
 * 
 * @author sist1
 *
 */
public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.>");
		
		String input = scanner.nextLine();
		int num      = Integer.parseInt(input);
		
		System.out.println("�Է�:"+input);
		System.out.printf("num= %d", num);
	}

}