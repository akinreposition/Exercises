import java.util.Scanner;
public class SimpleIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int x = collect.nextInt();
		
		x =1;
		int y =x;
		if( y < 0) {
			System.out.println("Hi");
		}
			if(y > 0) {
				System.out.println("Y is correct");	
		}
//				if(number % 3 == 0) {
//					System.out.println("HiPrime Number");
//				}
	}

}
