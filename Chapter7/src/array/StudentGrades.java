package array;

import java.util.Scanner;

public class StudentGrades {
	Scanner collect = new Scanner(System.in);

	int[] scores = new int[10]; // An array for scores.
	String[] grades = new String[10]; // An array for grades

	public void calculateGrades() {
		for (int i = 0; i < scores.length; i++) {
			System.out.print("Enter Score: ");
			int score = collect.nextInt();
			
			while (score < 0 || score > 100) {
				System.out.println("Re-enter score between 0 - 100: ");
				score = collect.nextInt();
			}

			if (score <= 30) {
				grades[i] = "F";
			} else if (score <= 40) {
				grades[i] = "E";
			} else if (score <= 50) {
				grades[i] = "D";
			} else if (score <= 60) {
				grades[i] = "c";
			} else if (score <= 70) {
				grades[i] = "B";
			} else {
				grades[i] = "A";
			}

			scores[i] = score;
		}
		
		System.out.println("Score    Grade");
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%n%s  \t %s ", scores[i], grades[i]);
		}
	}
}
