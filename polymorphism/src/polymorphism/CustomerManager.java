package polymorphism;

public class CustomerManager {

	private BaseLogger baseLogger;
	
	public CustomerManager(BaseLogger logger) {
		
		this.baseLogger=logger;
	}
	
	public void add() {
		System.out.println("Customer added.");
		baseLogger.log("Customer added.");
	} 
}
