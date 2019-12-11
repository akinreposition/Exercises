import java.util.Scanner;
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner collect= new Scanner(System.in);
		
		System.out.println("Welcome to Nonso Hardware store! ");
		
		Invoice storeInvoice = new Invoice("002", "Engine", 2, 500.00 );
		storeInvoice.getQuantity();
		storeInvoice.getPricePerItem();
		
		System.out.println("Enter Part Number: ");
		String partNumber = collect.nextLine();
		storeInvoice.setPartNumber(partNumber);
		
		System.out.println("Enter Part Description: ");
		String partDescription = collect.nextLine();
		storeInvoice.setPartDescription(partDescription);
		
		System.out.println("Enter Quantity Purchased: ");
		int quantity = collect.nextInt();
		storeInvoice.setQuantity(quantity);
		
	
		System.out.println("Enter Price Per Item: ");
		double pricePerItem = collect.nextDouble();
		storeInvoice.setPricePerItem(pricePerItem);
		System.out.printf("Total is %.2f",storeInvoice.getInvoiceAmount() );
		

		}
}
