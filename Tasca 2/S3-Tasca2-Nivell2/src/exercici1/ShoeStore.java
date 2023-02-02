package exercici1;

import java.util.ArrayList;

//create the ShoeStore class that will use the PaymentGateway to make payments:

public class ShoeStore {
	
	  private String name;
	  private ArrayList<String> inventory;
	  
	
	public ShoeStore(String name, ArrayList<String> inventory) {
		this.name = name;
		this.inventory = inventory;
	}


	public void sale(double amount, PaymentMethod paymentMethod) {
		
		PaymentGateway paymentGateway = new PaymentGateway();
		paymentGateway.pay(amount, paymentMethod);
		
    }

}
