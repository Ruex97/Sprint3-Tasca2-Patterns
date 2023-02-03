package S3.Nivell;

public class App {

	public static void main(String[] args) {
		float marketValue = 47.05f;
		StockMarketAgent stockMarketAgent = new StockMarketAgent(marketValue);
		
		StockAgency agency1 = new StockAgency(stockMarketAgent, marketValue);
		StockAgency agency2 = new StockAgency(stockMarketAgent, marketValue);
		
		stockMarketAgent.registerObserver(agency1);
		stockMarketAgent.registerObserver(agency2);
		
		stockMarketAgent.stockMarketGoesUp(2.4f);  		// This method calls notifyEveryone() 
		System.out.println("Agency 1: "  + agency1.getStockMarketValue()); 
		System.out.println("Agency 2: " + agency2.getStockMarketValue()); 
		
		stockMarketAgent.removeObserver(agency2);
		stockMarketAgent.stockMarketGoesUp(10f);
		
		System.out.println("Agency 1: "  + agency1.getStockMarketValue()); 
		System.out.println("Agency 2: " + agency2.getStockMarketValue()); 
		
	}
	
	
	/* Approach:
	- Interface Subject i Observer. Agent implement subj and agencies imp observers
	- StockAgent has value field. StockAgent has methods: add & remove, Up & down and notify
	- Methods that change market value must call notify too.
	- Agencies has only update() and this method its called inside notify, not by the own agency

	*/

}
