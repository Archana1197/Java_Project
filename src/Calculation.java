import java.util.Scanner;

public class Calculation {
	public static void main(String[] args) {
		Scanner cal=new Scanner(System.in);
		System.out.println("Enter first number");
		int a = cal.nextInt();
		System.out.println("Enter second number");
		int b = cal.nextInt();
		int add=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		System.out.println("The addition of two numbers:"+add);
		System.out.println("The subtraction of two numbers:"+sub);
		System.out.println("The multiplication of two numbers:"+mul);
		System.out.println("The division of two numbers:"+div);
        	
		
	
}

}

