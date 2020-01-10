package Exercises.chapter5;

public class Breakstatment {

	public static void main(String[] args) {
	int [] integerArray = {10,20, 30, 40, 50};
	
	for(int num : integerArray) {
		if(num == 40) {
		continue;
		}
		System.out.print(num);
		System.out.print("\n");
	}
		
	}

}
