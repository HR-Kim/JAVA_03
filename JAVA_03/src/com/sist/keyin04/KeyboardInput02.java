package com.sist.keyin04;

import java.util.Scanner;


/**
 * KeyBoard�Է� ó��
 * 
 * @author sist1
 *
 */
public class KeyboardInput02 {
    /**
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
		
		String input = scanner.nextLine();//Ű����� �Է��� ���ڿ��� input�� ����
		int num      = Integer.parseInt(input);//���ڿ��� ��ȯ�Ͽ� int������ ������ ����.
		
		System.out.printf("num= %d", num);
	}

}
