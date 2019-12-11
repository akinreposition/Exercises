import java.util.Scanner;
public class ClassAverage {

	Scanner collect = new Scanner(System.in);
	
	 int total =0;
	    int gradeCounter =1;
	
	public void calcuateAverage() {
		
		while(gradeCounter <=10) {
			System.out.println("Enter Grade: ");
			int grade = collect.nextInt();
			total= grade + total;
			
			gradeCounter++;
		}
		int average = total /10;
		
		System.out.printf("%n The Total Score is: %d%n", total);
		System.out.printf("%n The Average Score is: %d%n", average);
	}
}
