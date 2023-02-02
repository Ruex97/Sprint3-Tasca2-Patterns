package exercice1;

public class StockAgency implements Observer{
	
	protected float stockMarketValue;
	
	public StockAgency(Subject stockMarketAgent, float stockMarketValue) {
		this.stockMarketValue = stockMarketValue;
	}
	
	

	public float getStockMarketValue() {
		return stockMarketValue;
	}



	@Override
	public void update(float stockMarketValue) {
		 
		this.stockMarketValue = stockMarketValue;
				
	}

	

}
