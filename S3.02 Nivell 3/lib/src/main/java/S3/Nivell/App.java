package S3.Nivell;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// The currency taken as standard is Euro
		
		ArrayList<Product> inventory = new ArrayList<>();
		
		inventory.addAll(Arrays.asList(new Product("cereal", 2.80), new Product("milk", 1.80), 
									   new Product("bread", 0.90), new Product("tuna", 3.70),
									   new Product("chicken", 5.80), new Product("cheese", 10.30)));
		
		
		// I instantiate a converter for each currency and price displayer.
		
		CurrencyConverter dollarConverter = new EuroToDollar();
		CurrencyConverter YenConverter = new EuroToYen();
		CurrencyConverter PoundConverter = new EuroToPound();
		
		ProductPriceDisplay displayPriceInDollars = new ProductPriceDisplay(dollarConverter);
		ProductPriceDisplay displayPriceInYens = new ProductPriceDisplay(YenConverter);
		ProductPriceDisplay displayPriceInPounds = new ProductPriceDisplay(PoundConverter);
			 
		inventory.forEach(p -> displayPriceInDollars.displayPrice(p.getPrice(), "dollars"));
		System.out.println("");
		
		inventory.forEach(p -> displayPriceInYens.displayPrice(p.getPrice(), "yens"));
		System.out.println("");
		
		inventory.forEach(p -> displayPriceInPounds.displayPrice(p.getPrice(), "pounds"));
		
		inventory.get(0).convertPrice(PoundConverter);	
		
	
	}
	

}



/* Approach:
- Interface CurrencyConverter: This interface will be passed as an argument to the
  constructor of PriceDisplayer. Doing this we're doing a dependency injection. PD
  don't need to worry about creating new EuroToDollar, just in its core job: display
- Create 1 class that implement the CurrencyConverter for each currency with their 
  exchange rate with euro as a field.
- I include a method in product class as well to display price taking a CurrencyConverter

*/