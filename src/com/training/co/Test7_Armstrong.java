package com.training.co;

import java.util.Scanner; //Armstrong//

public class Test7_Armstrong {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number:");
			int number= sc.nextInt();
			int original=number;
			int temp;
			int check = 0;
			while(number>0)
			{
				temp=number%10;
				check=check+(temp*temp*temp);
				number=number/10;
				
			}
			if(original==check)
			{
				System.out.println("the given number is a armstrong number");
			}
			else
			{
				System.out.println("The number is not armstrong number");
			}
			
	 
		
	}
		
	}



