/**
 * 
 */
package assignment9;

/**
 * @Akin Odeku
 *
 */
public class Square extends Quadrillateral {

	public Square(Points a, Points b, Points c, Points d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}
	 	public double getSqrtArea() {
	 		return Math.pow(getDistance(getA(),getB()),2);
	 	}
	
	 	public String toString() {
			return String.format("%s %s%n%s %.2fcm is %.2fcm^2%n ", "The area of the Square with", super.toString(),
					"with Length", getDistance(getA(), getB()), getSqrtArea());
		}
}
