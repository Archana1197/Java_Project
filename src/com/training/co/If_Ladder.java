package com.training.co;

import java.util.Scanner;

public class If_Ladder {
	public static void main(String[] args) {
		
        	
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number:");
		int rollno=sc.nextInt();
        if(rollno==1)
		{
			System.out.println("Archana");
		}
		else if(rollno==2)
		{
			System.out.println("Abhinaya");
		}
		else if(rollno==3)
		{
			System.out.println("Meena");
		}
		else if(rollno==4)
		{
			System.out.println("Sarah");
		}
		else
		{
			System.out.println("Invalid rollno");
		}
		
	
		}
	}







