package assignment9;		//Package name

public class Quadrillateral {			//class name: quadrilaterial
				//declaration of the variable using the composition POINT
		private Points a;
		private Points b;
		private Points c;
		private Points d;
		
		 
		//constructor with 4 arguments
		public Quadrillateral(Points a, Points b, Points c, Points d) {
			super();
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}
		
		//setter and getter for the variables above
		public Points getA() {
			return a;
		}
		public void setA(Points a) {
			this.a = a;
		}
		public Points getB() {
			return b;
		}
		public void setB(Points b) {
			this.b = b;
		}
		public Points getC() {
			return c;
		}
		public void setC(Points c) {
			this.c = c;
		}
		public Points getD() {
			return d;
		}
		public void setD(Points d) {
			this.d = d;
		}
		
		//method to get the distance of the quadrilarteral using the math.sqrt and math.pow 
	public double getDistance(Points a, Points b) {
			return Math.sqrt(Math.pow(b.getX()- a.getX(),2) + Math.pow(a.getY()-b.getY(), 2));
	}
	
	//method toString to display the result in a string format
	@Override
	public String toString() {
		return String.format("%s ( %d, %d), (%d, %d), (%d, %d) and (%d, %d)", "Coordinates",
				getA().getX(), getA().getY(),
				getB().getX(), getB().getY(),
				getC().getX(), getC().getY(),
				getD().getX(), getD().getY());
	}
}
