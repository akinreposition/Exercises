import java.util.Scanner;
public class PrincipalAmount {
		Scanner input = new Scanner(System.in);
		 private double principal;
		 private double rate;
		 private int year;
		 private double amount;
		 
		 public void loan() {
		
		System.out.println("Enter Principal: ");
		 principal = input.nextDouble();
		
		System.out.println("Enter Years: ");
		 year = input.nextInt();
		 
		 System.out.println("Enter Rate: ");
		 rate = input.nextDouble();
		 
		 
		 for(year=1; year<=10; year++) {
			 amount = principal * Math.pow(1 + rate, year);
			 System.out.printf("%nThe Amount is %f", amount);
			 
		 }
		 }
}