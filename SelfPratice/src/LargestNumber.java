import java.util.Scanner;

/**
 * 
 */

/**
 * @author akin odeku
 *
 */
public class LargestNumber {
		
		public int largestValue = 0;
		public int number;
		
		Scanner collect = new Scanner(System.in);
		
	
		
		public int getNumber() {
			return number;
		}
		
		public void setNumber(int number) {
			this.number = number;
		}
		
		public int getLargestValue() {
			return largestValue;
		}
		
		public void setLargestValue(int largestValue) {
			this.largestValue = largestValue;
			
		}
	
		public int compareLargestValue() {
			int counter = 0;
			
			System.out.println("\tMama Tawa Food Catering...\n _______________________________________");
			
			
	
			System.out.println("Total sales to be recorded? ");
			int totalSales = collect.nextInt();
			
			
			
			while(counter < totalSales) {
			System.out.print("Enter Amount of Amala sold: ");
			setNumber(collect.nextInt());
			
			
			if(number > 100) {
				System.out.println("Please Re-Enter Amount of Amala sold!!! ");
			}
			
			if(largestValue < number) {
					largestValue = number;
			}
				counter++;
				
		}
			System.out.print("Largest Amount of Amala sold is ");
			return largestValue;
	}
}
		