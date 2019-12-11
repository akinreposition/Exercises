package array;
import java.security.SecureRandom;
public class VariableLengthTest {
	
	static SecureRandom randomNumber = new SecureRandom();
	static int[] array = new int[13];
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] number = {4,6,34};
//		//variablelength.delete duplicates
//		VariableLength.product(number);
//		System.out.print(args[2]);
		for(int i = 0; i < 36_000_000; i++) {
			int firstDie = 1 + randomNumber.nextInt(6);
			int secondDie = 1 + randomNumber.nextInt(6);
			
			sum = firstDie + secondDie;
			array[sum]++;
		}
		
		System.out.println("Sum" + "\t" + "Fequency");
			
		for(int i = 2; i < array.length; i++) {
			 System.out.println(i + "\t" + array[i]);
		}
	}

}
 