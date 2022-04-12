package com.training.co;

public class Test1 {
	public static void main(String[] args) {
		//
		int a=10;
		int b=20;
		a=a+b;//10+20=30=a//
	    b=a-b;//30-20=10=b//
		a=a-b;//30-10=20=a//
		System.out.println("a="+a +" and b = "+b);//
		
		//With using third variable//
		int c=10;
		int d=20;
		int temp;
		temp=c;
		c=d;
		d=temp;
		System.out.println("Swapping of c and d is:"+c+","+d);
		
		
	}

}

//SWAPPING OF TWO NUMBERS WITHOUT USING THIRD VARIABLE//
