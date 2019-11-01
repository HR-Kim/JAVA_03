package com.sist.primitive05;
/**
 * 특수문자
 * ----------------------------
 * 특수문자			문자 리터럴
 * ----------------------------
 * tab				\t
 * new line			\n
 * carriage return  \r
 * 역슬러시			\\
 * 작은따옴표			\'
 * 큰타옴표			\"
 * 유니코드			\\u 유니코드
 * ----------------------------
 * @author sist1
 *
 */
public class SpecialChar02 {
	public static void main(String[] args) {
		//D:\HR_BIG_0115\01_JAVA\doc\ppt_Java의정석
		System.out.println("D:\\HR_BIG_0115\\01_JAVA\\doc\\ppt_Java의정석");
		System.out.println("c:\\>");
		//JSON표현에 사용!
		// {"name2": 50, "name3": "값3", "name1": true}
		System.out.println("\"");//"
		System.out.println("\'");//'
		
		System.out.println("가나다\n1234");//new line
		System.out.println("가나다\t1234");//new line
		
		
	}

}
