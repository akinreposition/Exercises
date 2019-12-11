import java.util.Scanner;
public class AverageScore {

	public double average() {
		int counter = 0;
		double score = 0.0;
		double total = 0.0;
		double average = 0.0;
		int student = 0;
		Scanner collect = new Scanner(System.in);
		
		System.out.print("Enter number of students");
		counter = collect.nextInt();
		
		while(counter  >= 1) {
			
			System.out.print("Enter score");
			score = collect.nextDouble();
			total = total + score;
			counter--;
			total--;
		}
		average = total / counter;
		System.out.println(total);
		return total;
	}
}
