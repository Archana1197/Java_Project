package com.training.co;

import java.util.Scanner;

public class Test3 {
    int num;
    static boolean isprime=true;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		for (int i = 2;i<num; i++) {
			if (num%i == 0) {
				isprime=false;
				break;
				
			}
			
		}
		   if(isprime)
		      {
		    	  System.out.println(num+" is a prime number");
		      }
		      else
		      {
		    	  System.out.println(num+" is not a prime number");
		      }
	}

}
//prime or not