package reCapAbstract;

public class CustomerManager {

	private BaseDatabase baseDatabase;
	
	public CustomerManager(BaseDatabase database) {
		
		this.baseDatabase = database;
	}
	
	public void  add() {
		baseDatabase.add();
	}
}
