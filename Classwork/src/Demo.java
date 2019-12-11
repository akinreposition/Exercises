import java.util.Scanner;
public class Demo {

	public void test () {
		// TODO Auto-generated method stub
		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter Radius: ");// prompt user to input number
		int radius = collect.nextInt();  // save the input number
		
		if( radius > 0) {   			//initialized if statement and if radius > 0
			double area = radius * radius * 3.14159;  // solve for area with saved radius
			System.out.println("The area is " + radius + " is " + area);	// Display of the result for area
			System.out.println("correct Radius ");	//Display correct radius was collected from user
		}
		if(radius < 0) {						//if radius is less than 0
			System.out.println("incorrect Radius");	// display to user incorrect radius
		}
		if(radius == 0) {							// if radius is equal to 0
			System.out.println("0 is not radius");	// display 0 is not a radius
		}	//end of method
	}		//end of program


		
//		System.out.print("6 + 2 = 7 is FALSE");
//		
//		if(6 + 2 == 7 ) {
//			System.out.println("6 + 2 = 7 is Incorrect");
//		}
//		
		
			
	}


