package exercice1;

import java.util.ArrayList;

public class StockMarketAgent implements Subject{
	
	protected ArrayList<Observer> Observers;
	protected float stockMarketValue;
	
	public StockMarketAgent(float initialValue) {
		Observers = new ArrayList<>();
		stockMarketValue = initialValue;
	}

	@Override
	public void registerObserver(Observer o) {
		Observers.add(o);
		
		
	}

	@Override
	public void removeObserver(Observer o) {
		int index = Observers.indexOf(o);
		if (index != -1) { 
			Observers.remove(index);
			System.out.println("Agency removed");
		}
	}

	public float getStockMarketValue() {
		return stockMarketValue;
	}

	@Override
	public void notifyEveryone() {
		Observers.forEach(o -> o.update(stockMarketValue));
		
	}
	
	public void stockMarketGoesUp (float percentage) {
		System.out.println("Stock market has increased a " +percentage + "%");
		this.stockMarketValue += stockMarketValue*percentage/100;
		notifyEveryone();
		
	}
		
	public void stockMarketGoesDown (float percentage) {
		System.out.println("Stock market has decreased a " +percentage + "%");
		this.stockMarketValue -= stockMarketValue*percentage/100;
		notifyEveryone();
	}

}
