package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numberFind();
	}
	
	public static void numberFind() {
		int[] numbers = new int[] {1, 2, 5, 7, 9};
		int targetNumber = 5;
		boolean isFound = false;
		
		for (int number : numbers) {
			if (number == targetNumber) {
				isFound = true;
				break;
			}
		}
		
		showMessage(isFound);
		
	}
	
	public static void showMessage(boolean result) {
		if (result) {
			System.out.println("Number is found.");
		}else {
			System.out.println("Number is  not found.");
		}
	}

}
