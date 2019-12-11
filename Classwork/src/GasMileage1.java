import java.util.Scanner;

public class GasMileage1 {
	private int milesDriven;
	private int gallonUsed;
	private double total;
	private double average;
	
	Scanner input = new Scanner(System.in);

	public double gasMilage() {
		
		double milesPerGallon;
		int counter = 0;
		
		while(milesDriven != -1) {
			
		System.out.println("Enter Miles Driven: ");
		milesDriven = input.nextInt();
		
		System.out.println("Enter gallon used: ");
		gallonUsed = input.nextInt();
		
		milesPerGallon = (double)milesDriven / (double)gallonUsed;
		total = total + milesPerGallon;
		System.out.println();
		counter++;
		
	    average = total / counter;
		
		System.out.printf("Total Mile per Gallon is  %.2f%n", milesPerGallon);
		}
		System.out.printf("Average mileage is %.2f%n", average);
		return total;
	}
	
}
