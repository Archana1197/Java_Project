package com.training.co;
import java.util.Scanner;
public class Test6 {

		public static void main(String[] args) {
			int n1=0,n2=1,sum,length;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the length of series:");
			length=sc.nextInt();
		for (int i = 0; i < length; i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
		    n1=n2;
		    n2=sum;
			
		
		}
			
		}
	}
//Fibanocci series//

