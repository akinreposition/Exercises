package Exercises.chapter5;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Year: ");
		int year = input.nextInt();
		if(( year % 4 == 0 ) && (year % 100 != 0) || ( year % 400 == 0))
			System.out.println("The year you have entered is a Leap year");
		else
			System.out.println("The year you have entered is not a Leap year");
	}

}
