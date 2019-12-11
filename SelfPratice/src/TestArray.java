import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Index \t value \n");
//		int[] c = new int[12];
//		 c[0] = -45;
//		 c[1] = 6;
//		 c[2] = 0;
//		 c[3] = 72;
//		 c[4] =1543;
//		 c[5] = -89;
//		 c[6] = 0;
//		 c[7] = 62;
//		 c[8] = -3;
//		 c[9] = 1;
//		 c[10] = 6453;
//		 c[11] = 78;
//		 int total =0;
//		 for(int i = 0; i<12; i++) {
//			 total += c[i];
//			 System.out.printf("%d \t %d \n ",i, total );
//		 }
		int studentGrade =0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Student Grade");
		studentGrade= input.nextInt();
		
		if(studentGrade >=90) {
			System.out.println("A \nExcellent");
			}
		else {
			if(studentGrade >=80) {
				System.out.println("B");
				}
			else {
				if(studentGrade >=70) {
					System.out.println("C");
					}
				else {
					if(studentGrade >=60) 
						System.out.println("D");
					}
				 if(studentGrade <=59)
					  System.out.println("F");
						
						}
					
			System.out.println(studentGrade >=60 ? "Passed" : "passed");		
				
			}
		
	}

}
