package exercici1;

public class CreditCard implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Accepted credit card, thank you for your purchase!");
		
	}
	
}
