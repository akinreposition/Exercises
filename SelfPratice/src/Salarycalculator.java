import java.util.Scanner;

/**calculating the gross salary for all extra hours
 * 
 */

/**
 * @author akin odeku
 *
 */
public class Salarycalculator {
	
	public int hours = 50;
	public int excessHours =  75;
	int grossPay;
	public String employeeName;
	
	Scanner collect = new Scanner(System.in);
	
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int userHours) {
		this.hours = userHours;
	}
	
	public int getExcessHours() {
		return excessHours;
	}
	
	public void setExcessHours(int excess_Hours) {
		
		this.excessHours = excess_Hours;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String name) {
		
		this.employeeName = name;
	}
	
	public int calculateGrossPay() {
		System.out.println("Enter Employee Name: ");
		employeeName = collect.nextLine().toUpperCase();
	
		
		System.out.println("Enter Hours worked: ");
		int userHours = collect.nextInt();
		hours *= userHours; 
		
		System.out.println("Enter Excess Hours worked: ");
		int excess_Hours = collect.nextInt();
		excessHours *= excess_Hours;
		
		System.out.println(employeeName );
		System.out.print("Gross Pay is " );
		System.out.println(grossPay= hours + excessHours);
		return grossPay; 
		
	}
	
}
