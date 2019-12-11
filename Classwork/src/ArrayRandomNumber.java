import java.security.SecureRandom;
import java.util.Arrays;
public class ArrayRandomNumber {
	private static String anArray;
	private static SecureRandom random = new SecureRandom();
	private static int[] array = {4, 6, 5, 7, 3, 0, 9, 10, 11, 45, 34, 23, 67, 90, 22};
	private static boolean hasEqualValue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		randomizeArray(); 
	
	anArray = Arrays.toString(array);
	System.out.println(anArray);
		

	}

	public static void randomizeArray() {
		for(int loop = 0; loop < 24 * 15; loop++) {
			
			int firstPosition = random.nextInt(array.length);
			int secondPosition = random.nextInt(array.length);
			
			System.out.println(firstPosition);
			System.out.println(secondPosition);
			
			int firstPositionValue = array[firstPosition];
			int secondPositionValue = array[secondPosition];
			
			System.out.println(firstPositionValue);
			System.out.println(secondPositionValue);
			
			array[firstPosition] = secondPositionValue;
			array[secondPosition] = firstPositionValue;
		}
		
	}
	
}
