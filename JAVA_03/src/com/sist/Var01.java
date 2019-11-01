package com.sist;

public class Var01 {
    final static int WIDTH  = 20;//상수
    final static int HEIGHT = 10;//상수
    
    int   age        =  7;
    
    public Var01(){
    	//WIDTH = 50; //상수는 값을 변경 할수 없다.
    	age = 9;
    }
    
	public static void main(String[] args) {
		
		int rectangleArea = WIDTH * HEIGHT;
		int triangleArea  = (WIDTH * HEIGHT)/2;		
		
		System.out.println("rectangleArea:"+rectangleArea);
		System.out.println("triangleArea:"+triangleArea);
	}

}
