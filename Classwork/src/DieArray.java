import java.security.SecureRandom;
public class DieArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		
		int[] die = new int[7];
		for(int roll = 1; roll< 60_000_00; roll++) 
			++die[1 + random.nextInt(6)];
		
		System.out.printf("%s%20s%n ", "face", "frequency" );
		for(int face =1; face<die.length; face++) 
			System.out.printf("%d%20d%n ", face, die[face]);
		
		

//		int product =3;
//		while(product <= 100)
//			product = 3 * product;
//		System.out.println(product);
		
		
		
		
		
	}
}
  