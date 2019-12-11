
public class Aritmetric {
	private int a;
	private int b;
	
	public int sum() {
		int sum = a + b;
		System.out.printf("sum is %d%n" , sum);
		return sum;
	}
	
	public int multiply() {
		int multiply =  a* b ;
		//System.out.printf("multiply is %d%n", multiply );
		return multiply;
	}
	public void substract() {
		int substract =  a - b;
		System.out.println("substract is %d%n");
	}
	public void divide() {
		int divide =  a /   b;
		System.out.println("divide is %f%n");
	}
}
