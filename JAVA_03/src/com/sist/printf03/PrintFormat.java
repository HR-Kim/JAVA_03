package com.sist.printf03;
/**
 * printf(): ������� ����.
 * ---------------------
 * ������     | ����
 * ---------------------
 * %b       �Ҹ���
 * %d       10����
 * %x       16����    
 * %o        8���� 
 * ---------------------
 * @author sist1
 *
 */
public class PrintFormat {

	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';
		
		int   finger = 10;
		long  big    = 100_000_000_000L;
		long  hex    = 0xFFFF_FFFF_FFFF_FFFFl;
		
		
		
		System.out.printf("b=%b%n",b);//boolean
		System.out.printf("b=%d%n",b);
		System.out.printf("s=%d%n",s);

		System.out.printf("c=%c,%d %n",c,(int)c);
		System.out.printf("finger=[%5d]%n",finger);//finger=[   10]
		System.out.printf("finger=[%-5d]%n",finger);//[10   ]
		System.out.printf("finger=[%05d]%n",finger);//finger=[00010]
		
		System.out.printf("big=%d%n",big);//big=100000000000
		System.out.printf("hex=%#x%n",hex);//hex=0xffffffffffffffff
		long  octNum = 010;//10���� 8
		System.out.printf("octNum=%#o,%d %n",octNum,octNum);
		long  hexNum = 0x10;//10���� 16
		System.out.printf("hexNum=%#x,%d %n",hexNum,hexNum);
		
		int  binNum = 0b10;//10���� 2
		System.out.printf("binNum=%s,%d %n",Integer.toBinaryString(binNum),binNum);
	}

}
