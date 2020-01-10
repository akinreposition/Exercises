/**
 * 
 */
package Exercises.chapter5;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Smallestvalue {
	public int smallestValue;
	public int number;

	Scanner collect = new Scanner(System.in);

	public int getSmallestValue() {
		return smallestValue;
	}

	public void setSmallestValue(int smallestValue) {
		this.smallestValue = smallestValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void findTheSmallestValue() {

		System.out.print("Enter number of integer to be Used: ");
		int numTaken = collect.nextInt();
		smallestValue = Integer.MAX_VALUE;
		for (int i = 0; i < numTaken; i++) {
			
			System.out.println("Enter number: ");
			number = collect.nextInt();
			
			if (number < smallestValue ) {
				smallestValue = number;
			}
			

			while (number > 10 || number < 1) {
				System.out.println("Re-Enter Number: ");
				number = collect.nextInt();
			}

		}

		System.out.printf("Smallest Number is " + smallestValue);
	}

}
