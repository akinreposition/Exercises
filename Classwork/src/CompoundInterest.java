import java.util.Scanner;
public class CompoundInterest {
	
	
	
	
	public double Interest() {
		Scanner collect = new Scanner(System.in);
		System.out.println("Enter Amount: ");
		double principal = collect.nextDouble();
		
		System.out.println("Enter Number of Years: ");
		int year = collect.nextInt();
	
		double rate = 0.05;
		double amount;
		for(int i = 1; i <= year; i++) {
			amount = principal * (1 + rate);
			principal = amount;
		}
		return principal;
	}
	
	
}
