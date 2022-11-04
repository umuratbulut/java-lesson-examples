package strings;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "Weather is so good today.";
		System.out.println(message);
		
		System.out.println("Character count: " + message.length());
		System.out.println("5th character: " + message.charAt(4));
		System.out.println(message.concat(" Perfect!"));
		System.out.println(message.startsWith("W"));
		System.out.println(message.endsWith("t"));
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("s"));
		
		System.out.println(message.replace(' ', '-'));
		System.out.println(message.substring(2,4));
		
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}
