package exercice1;

public class Dollar implements Converter{

	
	
	@Override
	public double convert(double price) {
		return price*1.09;
	}

}
