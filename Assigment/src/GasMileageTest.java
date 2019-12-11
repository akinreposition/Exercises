import java.util.Scanner;
public class GasMileageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GasMileage obj = new GasMileage();
		Scanner collect = new Scanner(System.in);
		double total = 0.0;
		
		System.out.print("Enter number to start or -1 to stop: ");
		int odeku = collect.nextInt();
		
		while (odeku != -1) {
		
		System.out.println("Enter MilesDriven");
		int milesDriven = collect.nextInt();
		obj.setMilesDriven(milesDriven);
		
		System.out.println("Enter GallonUsed");
		int gallonUsed = collect.nextInt();
		obj.setGallonUsed(gallonUsed);
		double milesPerGallon = milesDriven / gallonUsed;
		System.out.println(milesPerGallon);
		total = total + milesPerGallon;
		
		System.out.print("Enter number to continue or -1 to stop: ");
		odeku = collect.nextInt();
		}

		System.out.println(total);
		
//		while(milesDriven != -1) {
//			if(milesDriven != -1) {
//				if(gallonUsed != -1);
//				double totalMiles =  ((double)milesDriven / gallonUsed);
//				System.out.print(totalMiles);				
//				return;
//	}

	//	}
	}
}