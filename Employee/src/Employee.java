
public class Employee {
	private String firstName;
	private String surname;
	private double monthSalary;
	
	public Employee(String firstName, String surname, double monthSalary ) {
		this.firstName = firstName;
		this.surname = surname;
		this.monthSalary = monthSalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getMonthSalary() {
		return monthSalary;
		
	}

	public void setMonthSalary(double monthSalary) {
		this.monthSalary = monthSalary;
		if (monthSalary < 0) {
			
	}
		
	
		
	}
	
	

}
