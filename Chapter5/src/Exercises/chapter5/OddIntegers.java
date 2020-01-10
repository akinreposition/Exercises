/**
 * 
 */
package Exercises.chapter5;

import java.util.Scanner;

/**
 * @author Akin odeku
 *
 */// Write an application that calculates the product of the
	// odd integers from 1 to 15.

// Prompt the user for integer values 15.
// if user input values below 1 and above 15, ask the user to re-enter
// save the integer valve
// find the odd value between 1 to 15 and get the total product
// Display the total product of the odd integers
public class OddIntegers {

	private int values = 0;
	

	Scanner collect = new Scanner(System.in);

	/**
	 * @return the values
	 */
	public int getValues() {
		return values;
	}

	/**
	 * @param values the values to set
	 */
	public void setValues(int values) {
		this.values = values;
	}

	public void findOddValues() {
		
			int oddValues = 1;
		
		System.out.print("Enter integer Number : ");
		values = collect.nextInt();
		
		for (int i = 1; i <= values; i++) {
			if (i % 2 == 1) {
				oddValues*=i;
				System.out.println(i);
			}
		}

//		while(values <Integer.MIN_VALUE || values > 15) {
//			System.out.println("Re-Enter integer Number: ");
//			values = collect.nextInt();
//			

//				
//				}		
		System.out.printf("Product of all odd integer "+ oddValues);
	}
	 
	
}
