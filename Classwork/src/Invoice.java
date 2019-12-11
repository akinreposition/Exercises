
public class Invoice {
	private String number;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	
	public Invoice (String num, String description, int qty, double item){
		this.number = num;
		this.partDescription = description;
		this.quantity = qty;
		this.pricePerItem = item;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getPartDescription() {
		return partDescription;
	}


	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public double getPricePerItem() {
		return pricePerItem;
	}


	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public double getInvoiceAmount() {
		double amount = quantity * pricePerItem;
		System.out.printf("amount is %.0f%n", amount);
		return amount;
		
	}
}

