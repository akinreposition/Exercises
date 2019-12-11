import java.util.Scanner;
public class CreditLimitCalculator {
	private int accountNumber;
	private int itemsChargedPerMonth;
	private int creditAppliedPerItems;
	private int creditLimit;
	private int newBalance;
	
	Scanner collect = new Scanner(System.in);

	
	public CreditLimitCalculator() {
		//newBalance =10_000;
		
	}
		
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber() {
		 System.out.println("Enter Account Number: ");
		accountNumber = collect.nextInt();
	}
	
	public int getCreditAppliedPerItems() {
		return creditAppliedPerItems;
	}
	public void setCreditAppliedPerItems() {
		creditAppliedPerItems = 5_000;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit() {
		creditLimit = 750;
	}
	public int getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(int newBalance) {
		if(newBalance > 10_000)
			System.out.println("Credit Limit Exceeded! ");
		this.newBalance = newBalance;
	}
	
	
	 public void CreditLimitCalculator() {
	
	 System.out.println("Enter Charges: ");
	 itemsChargedPerMonth = collect.nextInt();
	 
	 System.out.println("Enter Credit Applied: ");
	 int creditAppliedPeritem = collect.nextInt();
	 
	 System.out.println("Enter Credit Limit: ");
	 creditLimit = collect.nextInt();
	 
	 int beginningBalance = 0;
	 
	 newBalance = beginningBalance + itemsChargedPerMonth - creditAppliedPerItems;
	 
	 if(newBalance >= creditLimit) {
		// System.out.println("Credit Limit Exceeded!!! ");
		
		 System.out.printf("%d is newBalance", newBalance);
	 }
}

}