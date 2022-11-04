package reCapClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calculator = new Calculator();
		int sumResult = calculator.sum(5, 5);
		System.out.println(sumResult);
		
		int minusResult = calculator.minus(5, 5);
		System.out.println(minusResult);
		
		int multiplyResult = calculator.multiply(5, 5);
		System.out.println(multiplyResult);
		
		double devideResult = calculator.divide(5, 5);
		System.out.println(devideResult);
		
	}

}
