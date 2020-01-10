/**
 * 
 */
package Exercises.chapter5;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Akin Odeku
 *
 */
	//Write an application that calculates the of 1 through 20.
	//use type  long. Display the results in tabular format.
	//what difficutly might prevent you from calculating  the factorial of 100?

	//=====Pseudocode======
	//
public class Factorials {
	public static void main(String[]  args) {
	double  fact = 1;
	
	Scanner collect = new Scanner(System.in);
	
	System.out.print("Enter number: ");
	long number = collect.nextLong();  //it is the number to calculate factorial
	
	
	for(int i= 1; i<= number ; i++) {
		
		fact *= i;
		System.out.println(i+ "! \t\t" + fact );
		}
	System.out.println();
	System.out.println("Factorial of " + number+ " is:" + fact);
	}
}
