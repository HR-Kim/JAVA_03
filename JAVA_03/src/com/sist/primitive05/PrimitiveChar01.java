package com.sist.primitive05;

/**
 * char Ȯ��
 * char  ch ='A';
 * char  ch = 65;
 * 
 * int   code = (int)ch;
 * 
 * @author sist1
 *
 */
public class PrimitiveChar01 {

	public static void main(String[] args) {
		//char ch ='A';
		char ch =65;
		int  code = (int)ch;
		//0x41->10���� ��ȯ  = (16*1)*4+(16*0)*1
		
		System.out.printf("ch=%c,%d,(%#x)%n", ch,code,code);//ch=A,65

		//char hch ='��';  
		//char hch =0xAC00;
		char hch ='\uAC00';	
		System.out.printf("hch=%c,%d,(%#x)%n", hch,(int)hch,(int)hch);
		
	}

}
