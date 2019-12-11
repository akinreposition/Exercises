package craps;
import java.security.SecureRandom;
public class DiceGameCraps {
	public static void main(String[]  args) {
		SecureRandom randomNumber = new SecureRandom();
		
		
	int dice1 = 1 + randomNumber.nextInt(6);
	int dice2 = 1 + randomNumber.nextInt(6);
	int sum  = 0;
	int point =0;
	
	
//	
//	for(int d1= 1; d1 <= 6; d1++) {
//		dice1 =  randomNumber.nextInt(6);
//		for(int d2= 1; dice2 <= 6; dice2++) {
//			int firstThrowDice2 =randomNumber.nextInt(6);
//			 sum = dice1 + firstThrowDice2;
//		
//			 System.out.printf("%s%n First Throw %n ", sum);
//		}
//		
//	}
	
	}
}
