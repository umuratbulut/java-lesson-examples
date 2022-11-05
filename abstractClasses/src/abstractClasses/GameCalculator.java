package abstractClasses;

public abstract class GameCalculator {
	
	/*
	 * abstract bu classı extend eden diğer classlara bu methodu ovveride etme
	 * zorunluluğu getirir.
	 */
	public abstract void calculate(); 
	
	/* Final bu method hiçbir zaman değiştirilemez anlamı taşır. */
	public final void gameOver() {
		System.out.println("Game over");
	}

}
