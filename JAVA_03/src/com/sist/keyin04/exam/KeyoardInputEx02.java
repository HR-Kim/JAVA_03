package com.sist.keyin04.exam;

import java.util.Scanner;

public class KeyoardInputEx02 {
	public static void main(String[] args) {
		 System.out.println("�������� ���� ���Դϱ�?>>");

		Scanner scanner=new Scanner(System.in);
        String str = scanner.nextLine();
        double pi = Double.parseDouble(str);

        System.out.println("�������� ���� " + pi + " �Դϴ�.");

	}
}
