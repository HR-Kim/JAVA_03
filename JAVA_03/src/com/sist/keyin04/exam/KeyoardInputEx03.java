package com.sist.keyin04.exam;

import java.util.Scanner;

public class KeyoardInputEx03 {
	public static void main(String[] args) {
		System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�.>>");

		Scanner scanner=new Scanner(System.in);
        String strHeight = scanner.nextLine();
        String strWeight = scanner.nextLine();
        double height = Double.parseDouble(strHeight);
        double weight = Double.parseDouble(strWeight);

        System.out.println ("Ű�� "+ height + " ��Ƽ���� �Դϴ�.");
	    System.out.println ("�����Դ� "+ weight + " ų�α׷� �Դϴ�.");

	}
//	Ű�� �����Ը� �Է��Ͻʽÿ�.>>
//	178.5
//	64
//	Ű�� 178.5 ��Ƽ���� �Դϴ�.
//	�����Դ� 64.0 ų�α׷� �Դϴ�.
}
