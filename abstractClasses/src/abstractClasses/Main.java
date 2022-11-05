package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* abstract classlar tek başına new lenemez.*/
		GameCalculator gameCalculator= new WomanGameCalculator();
		gameCalculator.calculate();
		gameCalculator.gameOver();
	}

}
