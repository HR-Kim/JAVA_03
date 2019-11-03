package com.sist.keyin04.exam;

import java.util.Scanner;

public class KeyoardInputEx02 {
	public static void main(String[] args) {
		 System.out.println("원주율의 값은 얼마입니까?>>");

		Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        double pi = Double.parseDouble(str);

        System.out.println("원주율의 값은 " + pi + " 입니다.");

	}
}
