import java.util.Scanner;
public class RateOfYear {
	Scanner collect = new Scanner(System.in);
	private double principal;
	private int year;
	private double rate;
	private double amount;

		public void calculateRate() {
			
			System.out.println("Enter Principal: ");
			principal = collect.nextDouble();
			
			System.out.println("Enter Year: ");
			year = collect.nextInt();
			
			for(rate=5; rate<=10; rate++) {
				amount = principal * Math.pow(1 + (rate/100), year);
				System.out.printf("%nThe Rate is %f", amount);
			}
		}
}
