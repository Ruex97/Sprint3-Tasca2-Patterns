package exercici1;

// Create a functional interface that defines the payment method

@FunctionalInterface
public interface PaymentMethod {
	
	void pay(double payment);
	
}
