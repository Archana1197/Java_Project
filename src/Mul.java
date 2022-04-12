
public class Mul extends Add {
	@Override
	public void calculation(int a, int b) 
	{
    super.calculation(a, b);
    System.out.println("The multiplication of a and b is:");
	}
	public static void main(String[] args) 
	{
		Mul x= new Mul();
		x.calculation(10, 20);

	}
	
	}
