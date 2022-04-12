package com.training.co;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
	    int n;
		int fact=1;
		Scanner fac=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1 = fac.nextInt();
	
	         for(int i=1;i<=n1;i++)
					{
					fact=fact*i;
		            }
		System.out.println("The factorial of number is:"+fact);
		
		
	}

}

