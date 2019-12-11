import java.util.Scanner;
public class QuadraticEquation {
  private double a;
  private double b;
  private double c;
  private double r1;
  private double r2;
  private double realRoot;
  private double discriminant;
  
 
  
  public void setA(double newA) {
	  a = newA;
	  
  }
  public void setB(double newB) {
	  b = newB;
	  
  }
  public void setC(double newC) {
	  c =newC;
	  
  }
  public double getDiscriminant() {
	  return discriminant;
  }
  public double getRealRoot() {
	  return realRoot;
  }
  public double getR1() {
	  return r1;
  }
  public double getR2() {
	  return r2;
  }

  
  public void calculateDiscriminant() {
	 
	discriminant = b * b - 4 * a * c; 
  }
  public void calculateR1() {
	
	  r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
	  System.out.printf("The R1 is %.2f%n", r1);
  }
  public void calculateR2() {
	  r2 = (-b - Math.pow(discriminant, 0.5)) / ( 2 * a);
	  System.out.printf("The R2 is %.2f%n", r2);
  }
  public void calculateRealRoot() {
	  realRoot = r1;
	  System.out.printf("The realRoot is = r1 %n",realRoot);
  }
 public void collect(){
	  Scanner collect = new Scanner(System.in);
	  System.out.println("Enter A");
	  a = collect.nextDouble();
	  
	  System.out.println("Enter B");
	  b = collect.nextDouble();
	  
	  
	  System.out.println("Enter C");
	  c = collect.nextDouble();
	  
  } 
}
