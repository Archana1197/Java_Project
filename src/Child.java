
public class Child extends Addition {
	@Override
	void add(int number)
	{
		int base =2000;
		base=base+number;
		System.out.println("second added value:"+base);
	}
	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(300);
		Child b= new Child();
		b.add(400);
		
		
	}

}
