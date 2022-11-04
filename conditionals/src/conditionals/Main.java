package conditionals;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if-else
		int number = 20;
		
		if (number<20) {
			System.out.println("Number smaller than 20.");
		}else if (number==20) {
			System.out.println("Number equals to 20. ");
		}else {
			System.out.println("Number grater than 20.");
		}
		
		// switch-case
		char grade = 'B';
		switch(grade) {
			case 'A':
				System.out.println("Perfect: You're pass.");
				break;
			case 'B':
				System.out.println("Very good: You're pass.");
				break;
			case 'C':
				System.out.println("Good: You're pass.");
				break;	
			case 'D':
				System.out.println("Not bad: You're pass.");
				break;	
			case 'F':
				System.out.println("Bad: You doesn't pass.");
				break;	
			default:
				System.out.println("Bad: You doesn't pass.");
		}
	}

}
