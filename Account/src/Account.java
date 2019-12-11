
public class Account {
	private String name;
	private double balance;
	private int age;
	
	public Account(String name,double balance, int age) {
		this.name = name;
		this.balance = balance;
		this.age = age;
		
	}
	
	public void getName() {
		System.out.printf("The name of account is %s %n", name);
		
	}
	public void setName(String firstname) {
		name ="SCV" + firstname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
//	private double bvn;
//	private String accountType;
//	private Double balance;
//	private boolean isActive;
//	private double credit;
//	
//	public Account(String name, double bvn) {
//		this.name = name;
//		this.bvn = bvn;
//	}
//	public Account() {
//		
//	}
//
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getBvn() {
//		return bvn;
//	}
//	public void setBvn(double bvn) {
//		this.bvn = bvn;
//	}
//	public String getAccountType() {
//		return accountType;
//	}
//	public void setAccountType(String accountType) {
//		this.accountType = accountType;
//	}
//	public Double getBalance() {
//		return balance;
//	}
//	public void setBalance(Double balance) {
//		this.balance = balance;
//	}
//	public boolean isActive() {
//		return isActive;
//	}
//	public void setActive(boolean isActive) {
//		this.isActive = isActive;
//	}
//	public double credit(double value) {
//		double deduction = 0.05 * value;
//		double balance = value - deduction;
//		return balance;
//	}
//	public double value(double value) {
//		double finalValue = 0;
//		double deduction = 0.05 * value;
//		double balance = value - deduction;
//		if(balance <= 10_000) {
//			finalValue = value;
//		}
//		if (balance > 10_000) {	
//			finalValue = balance;
//		}
//		return finalValue;	
//
	}
//}
