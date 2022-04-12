
public class Override_Sub extends Override_Base {
	
	public void method1()
	{
        super.method1();
     
		System.out.println("a");
	}
	void method1(int a)
	{
	super.method1(30);
	a=a+10;
	System.out.println("a value is:"+a);
	}
	public static void main(String[] args) {
		Override_Base obj= new Override_Base();
		obj.method1(10);
		Override_Sub obj1= new Override_Sub();
		obj1.method1(20);
		
	}
	
	
	}


