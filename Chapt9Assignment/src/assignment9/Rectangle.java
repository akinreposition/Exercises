package assignment9;

public class Rectangle extends Quadrillateral{

	public Rectangle(Points a, Points b, Points c, Points d) {
		super(a, b, c, d);
		// TODO Auto-generated constructor stub
	}
		public double getArea() {
			return getDistance(getA(),getB()) * getDistance(getB(),getC());
		}
		
		@Override
		public String toString() {
			return String.format("%s %s%n%s %.2fcm  %s  %.2fcm is %.2fcm^2%n ", "The area of the Rectangle ABCD with", super.toString(),
					"with Length", getDistance(getA(), getB()),
					"and Breadth", getDistance(getA(), getD()), getArea());
		}
}
