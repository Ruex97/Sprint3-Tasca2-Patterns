package exercici1;

import java.util.ArrayList;
import java.util.Arrays;
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
		input.close();
		return value;

	}
	
	public static PaymentMethod PaymentMenu() {
		int option = -1;
		PaymentMethod choice = null;
		do {
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
				System.out.println("Payments that we accept and its usage:\n1.Paypal: paypal "
						+ "\n2.Credit card: credit card \n3.Bank account debt: bank account debt");
				break;
		} 
		} while (option < 1 || option > 3);
		
		return choice;
		
	}
}
