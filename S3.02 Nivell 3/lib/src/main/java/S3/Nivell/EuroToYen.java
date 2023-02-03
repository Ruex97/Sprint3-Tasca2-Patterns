package S3.Nivell;

public class EuroToYen implements CurrencyConverter {
	
	private static final double EXCHANGE_RATE = 141.72;
	
	@Override
	public double convert(double price) {
		return price*EXCHANGE_RATE;
	}

}
