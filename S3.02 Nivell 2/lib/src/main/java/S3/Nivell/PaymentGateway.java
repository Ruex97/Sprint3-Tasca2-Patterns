package S3.Nivell;


/* Create the PaymentGateway class that will receive an object encapsulating the payment 
method and invoke the payment without knowing the form: */

public class PaymentGateway {
	
	public void pay(double amount, PaymentMethod paymentMethod) {
	    paymentMethod.pay(amount);
	  }
	

}
