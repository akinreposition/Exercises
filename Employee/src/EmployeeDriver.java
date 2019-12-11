import java.util.Scanner;
public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee newEmployee = new Employee("akin", "odeku", 432576*12);
		Employee akinEmployee = new Employee ("tayo", "olakunle", 638758*12);
		System.out.printf("Your Yearly Salary is: %.0f%n", newEmployee.getMonthSalary());
		System.out.printf("Yearly Salary is %.0f", akinEmployee.getMonthSalary());
		
		
	}

}
