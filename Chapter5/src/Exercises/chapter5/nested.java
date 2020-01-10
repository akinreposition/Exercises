package Exercises.chapter5;

public class nested {

	public static void main(String[] args) {
		int n1 = 20, n2 = 30, n3 = 10, greatest;
		if(n1 >= n2) {
			if(n1 >= n3) {
				greatest = n1;
			} else {
				greatest = n3;
			}
		}else {
			if (n2 >= n3) {
				greatest = n2;
						
			}else {
				greatest = n3;
			}
		}
		System.out.println("Largest number is " + greatest );
	}

}
