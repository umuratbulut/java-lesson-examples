package reCapVowels;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char character = 'A';
		
		switch (character){
		case 'A':
		case 'I':
		case 'O':	
		case 'U':
			System.out.println("Character is bold vowel.");
			break;
		default:
			System.out.println("Character is thin vowel.");
		}
	}

}
