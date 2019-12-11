import java.util.Scanner;
public class Invoice {
		private String partNumber;
		private String partDescription;
		private int quantity;
		private double pricePerItem;
		Scanner newInput = new Scanner(System.in);
		
		
	public Invoice(String number,String description, int quantity, double perItem) {
		this.partNumber = number;
		this.partDescription = description;
		this.quantity = quantity;
		this.pricePerItem = perItem;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String Description) {
		
		this.partDescription = Description;
		}
		
	public int getQuantity() {
		
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity <= 0) {
			System.out.println("Enter correct Quantity");
			setQuantity(newInput.nextInt());
			
		}else {
		this.quantity = quantity;
	}
	}
	public double getPricePerItem() {
		
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem <=0) {
			System.out.println("Price is less than zero");
			setPricePerItem(newInput.nextDouble());
		}else {
		this.pricePerItem = pricePerItem;
		}
	}
	public double getInvoiceAmount() {
	 double total = quantity * pricePerItem;
	 if(quantity < 0 && pricePerItem <0) {
		 System.out.println("Error! Error!! Error!!!");
	 }else {
		return total;
	 }
	return total;
	}
}
