// Pseudo code

// 1. prompt user for number between 0-6;
// 2. save and collect step1
// 3. Assign a day for the week to the numbers starting from zero to 6;
// 4. if the number input is greater than 6, divide the number to 6,
// 5. save the number and display the day entered and the new day and week.
import java.util.Scanner;
public class DaysOfWeek {
		
		public void week() {
			Scanner collect = new Scanner(System.in);
	
			
			System.out.println("Enter a number: ");
			int number = collect.nextInt();			
			int week = 1;
			int day = 0;
			
			
			
			if(number<6) {
				day = number;
				
			}
			else {
				day = number % 7;
				week = number / 7 +1;
			}
			
			switch(day) {
			case '0':
				
				System.out.printf("Today is sunday %d", week);
				break;
				
			case '1':
			
				System.out.printf("Today is monday %d", week);
				break;
				
			case '2':
				
				System.out.printf("Today is tuesday %d", week);
				break;
				
			case '3':
				
				System.out.printf("Today is wednesday %d", week);
				break;
				
			case '4':
				
				System.out.printf("Today is thursday %d", week);
				break;
				
			case '5':
				
				System.out.printf("Today is friday %d", week);
				break;
				
			case '6':
				
				System.out.printf("Today is saturday %d", week);
				break;
				
			default:
				System.out.print("Not a valid day");
				break;
			}
			
			

					
		}


}