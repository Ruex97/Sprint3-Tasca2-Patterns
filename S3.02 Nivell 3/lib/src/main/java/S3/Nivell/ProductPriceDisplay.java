package S3.Nivell;


public class ProductPriceDisplay {
	
	private CurrencyConverter CurrencyConverter;

	
	public ProductPriceDisplay(CurrencyConverter converter) {
		this.CurrencyConverter = converter;
	}

	public void displayPrice(double price, String currency) {

	double convertedPrice = CurrencyConverter.convert(price);
	System.out.println("The price of this product in "+ currency + " is " + (convertedPrice));

	}

}
