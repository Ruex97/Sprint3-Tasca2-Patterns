package exercici1;

public class BankAccountDebt implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Accepted payment, thank you so much!");
		
	}
	
}
