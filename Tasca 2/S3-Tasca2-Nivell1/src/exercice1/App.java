package exercice1;

public class App {

	public static void main(String[] args) {
		float marketValue = 47.05f;
		StockMarketAgent stockMarketAgent = new StockMarketAgent(marketValue);
		
		StockAgency agency1 = new StockAgency(stockMarketAgent, marketValue);
		StockAgency agency2 = new StockAgency(stockMarketAgent, marketValue);
		
		stockMarketAgent.registerObserver(agency1);
		stockMarketAgent.registerObserver(agency2);
		
		stockMarketAgent.stockMarketGoesUp(2.4f);  							// This method calls notifyEveryone() aswell
		System.out.println("Agency 1: "  + agency1.getStockMarketValue()); 
		System.out.println("Agency 2: " + agency2.getStockMarketValue()); 
		
		stockMarketAgent.removeObserver(agency2);
		stockMarketAgent.stockMarketGoesUp(10f);
		
		System.out.println("Agency 1: "  + agency1.getStockMarketValue()); 
		System.out.println("Agency 2: " + agency2.getStockMarketValue()); 
		
	}

}
