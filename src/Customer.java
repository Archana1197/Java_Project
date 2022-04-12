
public class Customer implements Indusind_Bank,Hdfc_Bank {
	@Override
	public void gold_Loan_Interest_Rate() {
		System.out.println("Gold loan interest Rate is 8%");
		
	}
	@Override
	public void home_Loan_Interest_Rate() {
		System.out.println("Home loan interest Rate is 8%");
		
	}
	public static void main(String[] args) {
		Customer obj=new Customer();
		obj.gold_Loan_Interest_Rate();
		obj. home_Loan_Interest_Rate();
		
	}
	}


