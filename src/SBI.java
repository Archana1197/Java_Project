
public class SBI extends Bank 
{   
	 @Override
	int get_Rate_Of_Interest() {

		return 2;
	
}
public static void main(String[] args) {
	SBI s=new SBI();
	System.out.println("SBI rate of interest:"+ s.get_Rate_Of_Interest() );
	
}
}
