package com.sist.keyin04;

import java.util.Scanner;


/**
 * KeyBoard입력 처리
 * 
 * @author sist1
 *
 */
public class KeyboardInput03 {
    /**2개 이상의 숫자 출력 하기.
     * 표준출력(Standard output): 컴퓨터 장치(지금 사용하고 있는 모니터를 뜻한다.)
     * println 그화면에 문자열을 프린트 하시오.
     * System.out.println: 시스템에게 문자열을 모니터에 출력 하시오.
     * System.in: 키보드에서 문자열을 Enter를 맞날때 까지 입력 받으시오.
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>");//키보드 입력을 요구하는 메시지 출력
		
		String input01 = scanner.nextLine();//키보드로 입력한 문자열을 input에 저장
		int num1      = Integer.parseInt(input01);//문자열을 변환하여 int형식의 변수에 저장.
		System.out.print("숫자를 입력하세요.>");//키보드 입력을 요구하는 메시지 출력
		
		String input02 = scanner.nextLine();//키보드로 입력한 문자열을 input에 저장
		int num2      = Integer.parseInt(input02);//문자열을 변환하여 int형식의 변수에 저		
		System.out.printf("num1= %d\n", num1);
		System.out.printf("num2= %d\n", num2);
	}

}
