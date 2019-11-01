package com.sist.keyin04;

import java.util.Scanner;


/**
 * KeyBoard입력 처리
 * 
 * @author sist1
 *
 */
public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.>");
		
		String input = scanner.nextLine();
		int num      = Integer.parseInt(input);
		
		System.out.println("입력:"+input);
		System.out.printf("num= %d", num);
	}

}
