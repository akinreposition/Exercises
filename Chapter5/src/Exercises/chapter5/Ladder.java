package Exercises.chapter5;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		Scanner collect = new Scanner(System.in);
		System.out.println(" 1 = Sedan \n 2 = suv \n 3 = Sport \n 4 = Cross Breed \n Enter choice: ");
		int choice = collect.nextInt();
		
		if(choice == 1)
			System.out.println("Sedan class");
		else if (choice == 2)
			System.out.println("SUV class");
		else if (choice == 3)
			System.out.println("Sport class");
		else if (choice == 4)
			System.out.println("Cross Breed class");
		else
			System.out.println("Invalid choice ");
			
		

	}

}
