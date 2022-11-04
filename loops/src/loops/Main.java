package loops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// For
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("For loop is over.");
		
		// While
		int j=1;
		while (j < 11) {
			System.out.println(j);
			j++;
		}
		System.out.println("While loop is over.");
		
		// Do-While
		int c=1;
		do {
			System.out.println(c);
			c++;
		} while (c < 11);
		System.out.println("Do-While loop is over.");
	}

}
