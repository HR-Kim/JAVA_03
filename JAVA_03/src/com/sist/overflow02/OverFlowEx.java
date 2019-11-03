package com.sist.overflow02;
/**
 * OverFlow 확인
 * short sMin = -32768;
 * short sMax = 32767;
 * char cMin  = 0
 * char cMax  = 65535;
 * @author sist1
 *
 */
public class OverFlowEx {

	public static void main(String[] args) {
		short sMin = Short.MIN_VALUE;//-32768
		short sMax = Short.MAX_VALUE;//32767
		char cMin  = Character.MIN_VALUE;//0
		char cMax  = Character.MAX_VALUE;//65535
		 
		System.out.println(sMin);
		//overFlow 값에 의미 두지 말것.
		System.out.println("sMin-1="+ (short)(sMin-1));
		System.out.println(sMax);
		//overFlow 값에 의미 두지 말것.		
		System.out.println("sMax+1="+ (short)(sMax+1));
		System.out.println("------------------------");
//		System.out.println((int)cMin);
//		System.out.println((int)cMax);
//		
//		System.out.println("cMin-1="+ (int)(cMin-1));
//		System.out.println("cMax+1="+ (int)(cMax+1));
		

	}

}
