package S3.Nivell;

public class EuroToDollar implements CurrencyConverter{

	private static final double EXCHANGE_RATE = 1.09;
	
	@Override
	public double convert(double price) {
		return price*EXCHANGE_RATE;
	}

}




