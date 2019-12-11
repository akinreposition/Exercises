//generate numbers between 0-20;
//pick all even number between 0-20;
//after picking the even number add all even numbers together;
//if 20 is displayed in the even number, do not add;
//use the enhanced for loop;
import java.security.SecureRandom;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] e = new int[20];
		int total = 0;
		SecureRandom random = new SecureRandom();
		
		for(int i : e) {
			e[i]= 1 + random.nextInt(20);
			if (e[i] % 2 ==0 && e[i] != 20)

				total += e[i];
			System.out.printf(" %d%n", e[i]);
			
		}	
		System.out.printf("%n%d", total);
	}

}



		
	
