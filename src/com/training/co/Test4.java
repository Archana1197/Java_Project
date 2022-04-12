package com.training.co;
import java.util.Scanner;

public class Test4 {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		StringBuffer s1=new StringBuffer(str);  //s1=string buffer object//
		s1.reverse(); 
		String s2=s1.toString(); //conversion of object into string//
		
		if(str.equals(s2))  //str=original string and s2=reversed string//
		{
			System.out.println(s2+"is a palindrome String");
		}
		else
		{
			System.out.println(s2+"is not a palindrome String");
		}
		}
	}

//palindrome//
