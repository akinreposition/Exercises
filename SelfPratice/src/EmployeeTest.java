import java.util.Scanner;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner collect = new Scanner(System.in);
		
		Employee obj = new Employee("nike", "tunji", 200);
		obj.getFirstName();
		obj.getLastName();
		obj.getMonthlySalary();
		obj.calculateSalary();
		
		System.out.println("Enter First Name: ");
		String firstName = collect.nextLine();
		obj.setFirstName(firstName);
		
		System.out.println("Enter Last Name: ");
		String lastName = collect.nextLine();
		obj.setLastName(lastName);
		
		System.out.println("Enter Monthly Salary: ");
		double monthlySalary = collect.nextDouble();
		obj.setMonthlySalary(monthlySalary);
		
		System.out.printf("Yearly Salary is %.2f", obj.calculateSalary()); 
	}

}
