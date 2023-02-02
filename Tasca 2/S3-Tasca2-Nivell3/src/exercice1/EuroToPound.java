package exercice1;

public class EuroToPound implements CurrencyConverter {
	
	private static final double EXCHANGE_RATE = 0.89;
	
	@Override
	public double convert(double price) {
		return price*EXCHANGE_RATE;
	}

}

