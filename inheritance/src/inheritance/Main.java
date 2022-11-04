package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.age = 22;
		customer.email ="example@exam.com";
		
		employee.age = 32;
		employee.salary = 15000;
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.add();
		employeeManager.bestEmployee();
		
		customerManager.add();
		customerManager.customerProducts();
	}

}
