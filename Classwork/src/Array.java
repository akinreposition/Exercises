
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks = {0,0,0,0,0,0,1,2,4,2,1};
		//00-09
		//10-19
		//20-29
		//.
		//.
		//100
		for(int counter = 0; counter < marks.length; counter++) {
			System.out.printf("%02d - %02d: \n", counter * 10, counter * 10 + 9);
			if(counter ==100) {
				 System.out.printf("%5d", counter);
			 }else {
				 
			 }
		}
		 
	}

}
