package S3.Nivell;


public class BankAccountDebt implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Accepted payment, thank you so much!");
		
	}
	
}
