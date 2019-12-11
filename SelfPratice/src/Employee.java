
public class Employee {
		private String firstName;
		private String lastName;
		private double monthlySalary;
		
		
	public Employee(String firstname, String surname, double salary) {
		this.firstName = firstname;
		this.lastName = surname;
		this.monthlySalary = salary;
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary <= 0) {
		System.exit(0);
		}
		this.monthlySalary = monthlySalary;
	}
	public double calculateSalary() {
	double yearlySalary = monthlySalary * 12;
	double increase = yearlySalary * 0.1;
		return increase;
	}

}
