import java.util.Scanner;
public class StudentScore {

	static Scanner collect = new Scanner(System.in);
	
	private static int total = 0;
	private static int gradeCounter = 0;
	
	public static void calculateGrade() {
		
		
//		while(gradeCounter <= 5) {
//			
//			System.out.println("Enter Grade: ");
//			int grade = collect.nextInt();
//			if(grade > 100 || grade < 0) {
//				System.out.println("Please Re-Enter Grade: ");
//				 grade = collect.nextInt();
//			}
//			total += grade;
//			gradeCounter++;
//				
		
		System.out.println("Enter Grade or -1 to terminate: ");
		int grade = collect.nextInt();
		
		while (grade != -1) {
			
			total += grade;
			gradeCounter ++;
			
			System.out.println("Enter Grade or -1 to terminate: ");
		    grade = collect.nextInt();
		}
		
		if(gradeCounter != 0) {
			double average = (double)total / gradeCounter;
			
			System.out.printf("%nTotal of the %d Grade is %d%n", gradeCounter, total);
			System.out.printf("%nThe Average Grade is %.2f%n", average);
		}else 
			System.out.println("No grades were Entered! ");
			
	}
		
//		int average = total / 5;
//		 System.out.printf("%nThe total Grade is: %d%n", total);
//		 
//		System.out.printf("The Average Grade is: %d", average);
//	}
}
