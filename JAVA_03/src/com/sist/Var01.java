package com.sist;

public class Var01 {
    final static int WIDTH  = 20;//���
    final static int HEIGHT = 10;//���
    
    int   age        =  7;
    
    public Var01(){
    	//WIDTH = 50; //����� ���� ���� �Ҽ� ����.
    	age = 9;
    }
    
	public static void main(String[] args) {
		
		int rectangleArea = WIDTH * HEIGHT;
		int triangleArea  = (WIDTH * HEIGHT)/2;		
		
		System.out.println("rectangleArea:"+rectangleArea);
		System.out.println("triangleArea:"+triangleArea);
	}

}
