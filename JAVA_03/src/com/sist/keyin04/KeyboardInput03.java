package com.sist.keyin04;

import java.util.Scanner;


/**
 * KeyBoard�Է� ó��
 * 
 * @author sist1
 *
 */
public class KeyboardInput03 {
    /**2�� �̻��� ���� ��� �ϱ�.
     * ǥ�����(Standard output): ��ǻ�� ��ġ(���� ����ϰ� �ִ� ����͸� ���Ѵ�.)
     * println ��ȭ�鿡 ���ڿ��� ����Ʈ �Ͻÿ�.
     * System.out.println: �ý��ۿ��� ���ڿ��� ����Ϳ� ��� �Ͻÿ�.
     * System.in: Ű���忡�� ���ڿ��� Enter�� �³��� ���� �Է� �����ÿ�.
     * @param args
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���.>");//Ű���� �Է��� �䱸�ϴ� �޽��� ���
		
		String input01 = scanner.nextLine();//Ű����� �Է��� ���ڿ��� input�� ����
		int num1      = Integer.parseInt(input01);//���ڿ��� ��ȯ�Ͽ� int������ ������ ����.
		System.out.print("���ڸ� �Է��ϼ���.>");//Ű���� �Է��� �䱸�ϴ� �޽��� ���
		
		String input02 = scanner.nextLine();//Ű����� �Է��� ���ڿ��� input�� ����
		int num2      = Integer.parseInt(input02);//���ڿ��� ��ȯ�Ͽ� int������ ������ ��		
		System.out.printf("num1= %d\n", num1);
		System.out.printf("num2= %d\n", num2);
	}

}
