package Exercises.chapter5;

import java.util.Scanner;

public class Elseifloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any integer value: ");
		int num = input.nextInt();
		if(num % 2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
			
	}

}
