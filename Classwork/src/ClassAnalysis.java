import java.util.Scanner;
public class ClassAnalysis {

	public static void main(String[] args) {
	 Scanner collect = new Scanner(System.in);
	
	  int passes = 0;
	  int failures = 0;
	  int studentsCounter =1;

		
		while (studentsCounter <= 10) {
			System.out.println("Enter Exam Grade(1 =Pass, 2 = fail): ");
			int result = collect.nextInt();
			
			if (result ==1) 
			passes++;
			else
				failures++;
			
			studentsCounter++;
		}		
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		if (passes > 8)
			System.out.println("Bonus to instructor!");
		
	}
}