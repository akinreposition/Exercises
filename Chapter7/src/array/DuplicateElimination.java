package array;
import java.util.Scanner;
public class DuplicateElimination {
	Scanner collect = new Scanner(System.in);

	int[] number = new int[5];

	public void display() {
		while(number[0] <10 || number[0] >100) {
			System.out.print("Enter Number: ");
			number[0]  = collect.nextInt();
		}
		System.out.println(number[0]);
		
		System.out.print("Enter SecondNumber: ");
		number[1]  = collect.nextInt();
		
		while(number[1]==number[0] || number[1] <10 || number[1] >100 ) {
			System.out.println("Enter SecondNumber again: ");
			number[1]  = collect.nextInt();
		}
		System.out.println(number[0] + " " + number[1]);
		
		
		
		System.out.println("Enter ThirdNumber: ");
		number[2]  = collect.nextInt();
		
		while(number[2]==number[0] || number[2] == number[1] || number[2] <10 || number[2] >100) {
			System.out.println("Enter Third Number again: ");
			number[2]  = collect.nextInt();
		}
		
		System.out.println(number[0] + " " + number[1] + " " + number[2]);
		
		
		
		System.out.println("Enter Fourth Number: ");
		number[3]  = collect.nextInt();
		
		while(number[3]==number[0] || number[3] == number[1] || number[3] ==number[2] || number[3] <10 || number[3] >100) {
			System.out.println("Enter Fourth Number again: ");
			number[3]  = collect.nextInt();
		}
		
		System.out.println(number[0] + " " + number[1] + " " + number[2] + " " + number[3]);
		
		
		
		System.out.println("Enter Fifth Number: ");
		number[4]  = collect.nextInt();
		
		while(number[4]==number[0] || number[4] == number[1] 
				|| number[4] ==number[2] ||number[4] ==number[3] 
						|| number[4] <10 || number[4] >100)   {
			System.out.println("Enter Fifth Number again: ");
			number[4]  = collect.nextInt();
		}
		
		System.out.println(number[0] + " " + number[1] + " " + number[2] + " " + number[3] + " " + number[4]);
		
	}
}  