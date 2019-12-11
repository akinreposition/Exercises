import java.util.Scanner;

public class EvenNumber {
	private int value;
	
	public void EvenNumber(){
	Scanner collect = new Scanner (System.in);
	System.out.println("Enter Value");
	int value = collect.nextInt();
	
	
	if(value % 2 != 0) {
		System.out.println(value);
	}
	else {
		System.out.println(value);
		
		for(int  i =2; i <= value; i=i+2) {
			System.out.println(i);

			}
// 		final double PI = 3.14159; //Declaring a constant
		}
	}
}