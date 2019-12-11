import java.util.Scanner;																	//import Scanner object
public class SafeAccountDrive {																//class driver 

	public static void main(String[] args) {												//Main method starts
		// TODO Auto-generated method stub
		
		SafeAccount account1 = new SafeAccount("Akin odeku", 50.00);						//creating obj account1 to call Safe Account
		SafeAccount account2 = new SafeAccount("Lolu odeku", -7.53);						//creating obj account2 to call Safe Account
		
		System.out.printf("%s balance $%.2f%n",account1.getName(), account1.getbalance());
		System.out.printf("%s balance $%.2f%n", account2.getName(), account2.getbalance());
		
		Scanner collect = new Scanner(System.in);
		
		System.out.println("Enter Deposit Amount for Account1");
		double depositAmount = collect.nextDouble();
		System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		
		
		System.out.printf("%s balance $%.2f%n", account1.getName(), account1.getbalance());
		System.out.printf("%s balance $%.2f%n", account2.getName(), account2.getbalance());
		
		System.out.println("Enter withdrawal Amount");
		double withdraw= collect.nextDouble();
		System.out.printf("%n substracting %f Your balance after withdrawal %n%n",account1.withdrawal(5000));
		
		
		
		System.out.println("Enter Deposit Amount for Account2");
		depositAmount = collect.nextDouble();
		System.out.printf("%n adding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
		
		System.out.printf("%s balance $%.2f%n", account1.getName(), account1.getbalance());
		System.out.printf("%s balance $%.2f%n", account2.getName(), account2.getbalance());
		
	
	}
	

}
