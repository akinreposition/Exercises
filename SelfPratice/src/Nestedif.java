import java.util.Scanner;
public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		double area =0;
//		int radius = 0;
//		
//		radius = input.nextInt();
//		if(radius> 0) {
//			 area =radius * radius * Math.PI;
//			 System.out.println("the area of the circle of radius " + radius + " is " + area);
//	
//		}
//		else 
//			System.out.println("Negative input");
		
//		
//		System.out.println("Enter NUmber ");
//		 int number = input.nextInt();
//			int number;
//		if(number % 2 ==0)
//			System.out.println(number + " is even");
//		else
//			System.out.println(number + " is odd");
		
		double pay =0;
		int score = 0;
		
		System.out.println("enter Score : ");
		score = input.nextInt();
		
		System.out.println("enter pay : ");
		pay = input.nextInt();
		
		if(score > 90) {
			pay = (0.03 * pay) + pay;
			System.out.println(pay);
		}
		else {
			pay = (0.01 * pay) + pay;
			System.out.println(pay);
			
				
			}
		
		
		}
			
	}


