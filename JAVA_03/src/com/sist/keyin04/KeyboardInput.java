package com.sist.keyin04;

import java.util.Scanner;


/**
 * KeyBoard입력 처리
 * 
 * @author sist1
 *
 */
public class KeyboardInput {
    /**
     * 표준출력(Standard output): 컴퓨터 장치(지금 사용하고 있는 모니터를 뜻한다.)
     * println 그화면에 문자열을 프린트 하시오.
     * System.out.println: 시스템에게 문자열을 모니터에 출력 하시오.
     * System.in: 키보드에서 문자열을 Enter를 맞날때 까지 입력 받으시오.
     * @param args
     */
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
