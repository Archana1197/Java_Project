
public class ICICI extends Bank {
	int get_Rate_Of_Interest()
	{
		return 4;
	}
	
	public static void main(String[] args) {
		ICICI i=new ICICI();
		System.out.println("ICICI rate of interest:"+ i.get_Rate_Of_Interest() );
		SBI s=new SBI();
		System.out.println("SBI rate of interest:"+ s.get_Rate_Of_Interest() );
		
	
	}
}
