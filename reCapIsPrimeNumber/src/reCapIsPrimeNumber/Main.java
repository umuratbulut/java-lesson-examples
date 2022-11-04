package reCapIsPrimeNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 25;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Number is not prime.");
			return;
		}
		
		if (number < 1) {
			System.out.println("Number is not valid.");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				
			}
		}
		
		if (isPrime) {
			System.out.println("Number is prime.");
		}else {
			System.out.println("Number is not prime.");
		}
	}

}
