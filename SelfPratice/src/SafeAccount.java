
public class SafeAccount {
	
		private String name;
		private double balance;
		private double withdraw;
	public SafeAccount(String name, double balance) {
		this.name = name;
		if(balance > 0.0) {
			this.balance = balance;
		}
	}
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0) {
			balance += depositAmount;
		}
	}
	public double withdrawal(double withdraw) {
		if(withdraw < balance) {
			balance -= withdraw;
		
			
		}
		if(withdraw >= balance){
			System.out.printf("Withdrawal amount exceed account balance  %.2f", balance);
		}
		return balance;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}