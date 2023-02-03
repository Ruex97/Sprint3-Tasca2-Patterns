package S3.Nivell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		
		ArrayList<String> inventory = new ArrayList<>();
		inventory.addAll(Arrays.asList("airmax", "adidas", "puma", "balenciaga"));
		
		ShoeStore shoeStore1 = new ShoeStore ("fit2Feet", inventory);		
	
		shoeStore1.sale(79.99, PaymentMenu());
		
		
	}
	
	public static int typeInt(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println(str);
		int value = input.nextInt();
		return value;

	}
	
	public static PaymentMethod PaymentMenu() {
		int option = -1;
		PaymentMethod choice = null;
		do {
		try {
		option = typeInt("How will you pay? \n1.Paypal \n2.Credit card \n3.Bank account debt ");
		switch(option) {
			case 1:
				choice = new PayPal();
				break;
			case 2:
				choice = new CreditCard();
				break;
			case 3:	
				choice = new BankAccountDebt();
				break;
			default:
				System.out.println("Payments that we accept and its usage:\n1.Paypal"
						+ "\n2.Credit card \n3.Bank account debt");
				break;
		} 
		} catch (InputMismatchException e) {
			System.out.println("Payments that we accept and its usage:\n1.Paypal"
					+ "\n2.Credit card \n3.Bank account debt\n");
		}
		} while (option < 1 || option > 3);
		
		return choice;
		
	}
	
	
	
}



/* Approach:
- Interface PaymentMethod that defines the payment method
- Classes that implement the PaymentMethod interface: 3
- Create the PaymentGateway class: receives object encapsulating the payment 
method, and invoke the payment without knowing the form
- Finally, create the ShoeStore class that will use the PaymentGateway to make payments

*/