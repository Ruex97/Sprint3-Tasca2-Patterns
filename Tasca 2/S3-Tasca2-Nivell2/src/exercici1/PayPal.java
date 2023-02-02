package exercici1;


public class PayPal implements PaymentMethod{

	@Override
	public void pay(double payment) {
		System.out.println("Transaction accepted. We will deliver in 3 days");
		
	}
	


}
