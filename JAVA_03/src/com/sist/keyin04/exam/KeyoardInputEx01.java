package com.sist.keyin04.exam;

import java.util.Scanner;

public class KeyoardInputEx01 {

	public static void main(String[] args) {
		System.out.println("당신은 몇 살입니까?>>");

		Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        int num = Integer.parseInt(str);

        System.out.println("당신은 " + num + " 살 입니다.");

	}

}
