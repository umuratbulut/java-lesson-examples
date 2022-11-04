package reCapFindNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[] {1, 2, 5, 7, 9};
		int targetNumber = 5;
		boolean isFound = false;
		
		for (int number : numbers) {
			if (number == targetNumber) {
				isFound = true;
				break;
			}
		}
		
		if (isFound) {
			System.out.println("Number is found.");
		}else {
			System.out.println("Number is  not found.");
		}
	}

}
