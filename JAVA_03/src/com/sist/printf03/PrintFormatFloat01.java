package com.sist.printf03;
/**
 * printf(): 출력형식 지정.
 * ---------------------
 * 지시자     | 설명
 * ---------------------
 * %f       부동 소수점
 * %e       지수 
 * %s       문자열  
 * ---------------------
 * @author sist1
 *
 */
public class PrintFormatFloat01 {
	
	public static void main(String args[]){
		String url = "www.sist.co.kr";
		
		float f01 = .10f;//0.10
		float f02 = 1e1f;//10.0
		float f03 = 3.14e3f;//
		
		double d  = 1.23456789;
		//------------------------------------------------
		// float : %f,%e,%g
		//------------------------------------------------
		
		//f01=0.100000, 1.000000e-01, 0.100000
		System.out.printf("f01=%f, %e, %g%n",f01,f01,f01);
		
		//f02=10.000000, 1.000000e+01, 10.0000
		System.out.printf("f02=%f, %e, %g%n",f02,f02,f02);
		
		//f03=3140.000000, 3.140000e+03, 3140.00
		System.out.printf("f03=%f, %e, %g%n",f03,f03,f03);
		
		//------------------------------------------------
		// double : %f,%14.10f
		//------------------------------------------------		
		System.out.printf("d=%f%n", d);//d=1.234568
		System.out.printf("d=[%14.10f]%n", d);//d=[  1.2345678900]
		System.out.printf("d=[%014.10f]%n", d);//d=[001.2345678900]
	
		//------------------------------------------------
		// String : %s
		//------------------------------------------------
		System.out.printf("%s%n", url);//www.sist.co.kr
		System.out.printf("[%16s]%n", url);//[  www.sist.co.kr]  오른쪽정열
		System.out.printf("[%-16s]%n", url);//[www.sist.co.kr  ] 왼쪽정열
		System.out.printf("[%.10s]%n", url);//[www.sist.c] 왼쪽부터 10자리
		
	}
}









