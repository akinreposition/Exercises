package testApp;

import assignment9.Points;
import assignment9.Rectangle;
import assignment9.Square;

public class QuadralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Points A = new Points(0,0);
		Points B = new Points(5,3);
		Points C = new Points(5,7);
		Points D = new Points(0,4);
		
		Rectangle newRectangle = new Rectangle(A,B,C,D);
		Square	newSquare = new Square(A,B,C,D);
		
		System.out.println(newRectangle);
	}

}
