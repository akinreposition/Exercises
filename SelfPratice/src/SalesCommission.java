import java.util.Scanner;			//import scanner to collect input

public class SalesCommission {

	public static void main(String[] args) {
		//declaring and initialization of variables
	double items1 = 239.99;
	double items2 = 129.75;
	double items3 = 99.95;
	double items4 = 350.89;
	double total = 0;
	double grossSales = 0;
	
	//creating the object scanner
	Scanner input = new Scanner(System.in);

		System.out.println("Enter 0 to start application and -1 to quit ");
		int itemNumber = input.nextInt();
		
		while(itemNumber != -1) {
		System.out.println("Enter Item Number: ");
		itemNumber = input.nextInt();
		
		if(itemNumber == 1)
			total += items1;
		
		if(itemNumber == 2)
			total += items2;
		
		if(itemNumber == 3)
			total += items3;
		
		if(itemNumber == 4)
			total += items4;
		
		if(itemNumber < 1 || itemNumber > 4) {
			System.out.println("Invalid item Number!");
		}
	
	}
		
		System.out.printf("Gross sales is %.2f%n",grossSales = 200 + (0.09 * total));

		System.out.printf("Total is %.2f: ",total);
}		

}
