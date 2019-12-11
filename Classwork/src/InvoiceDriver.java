import java.util.Scanner;
public class InvoiceDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner collect = new Scanner(System.in);
		
		
		System.out.println("Enter number: ");
		String partnumber = collect.nextLine();
		
		
		System.out.println("Enter description: ");
		String partDescription = collect.nextLine();
		
		
		System.out.println("Enter quantity");
		int Quantity = collect.nextInt();
		

		System.out.println("Enter item: ");
		double pricePerItem = collect.nextDouble();
		
		Invoice newInvoice = new Invoice(partnumber, partDescription, Quantity, pricePerItem);
		System.out.printf("%s%n", newInvoice.getNumber());
		System.out.printf("%f%n",newInvoice.getInvoiceAmount());
		System.out.printf("%f%n", newInvoice.getPricePerItem());
			
	}

}
