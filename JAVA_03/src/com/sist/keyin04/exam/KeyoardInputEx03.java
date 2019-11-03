package com.sist.keyin04.exam;

import java.util.Scanner;

public class KeyoardInputEx03 {
	public static void main(String[] args) {
		System.out.println("키와 몸무게를 입력하십시오.>>");

		Scanner scanner=new Scanner(System.in);
        String strHeight = scanner.nextLine();
        String strWeight = scanner.nextLine();
        double height = Double.parseDouble(strHeight);
        double weight = Double.parseDouble(strWeight);

        System.out.println ("키는 "+ height + " 센티미터 입니다.");
	    System.out.println ("몸무게는 "+ weight + " 킬로그램 입니다.");

	}
//	키와 몸무게를 입력하십시오.>>
//	178.5
//	64
//	키는 178.5 센티미터 입니다.
//	몸무게는 64.0 킬로그램 입니다.
}
