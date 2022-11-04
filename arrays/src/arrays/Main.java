package arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] students = new String[3];
		students[0] = "Lara";
		students[1] = "Stolov";
		students[2] = "Angel";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("---------------");
		
		for (String student : students) {
			System.out.println(student);
		}
	}

}
