package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
		teacherLoanManager.calculate();
		
		AgricultureLoanManager agricultureLoanManager = new AgricultureLoanManager();
		agricultureLoanManager.calculate();
	}

}
