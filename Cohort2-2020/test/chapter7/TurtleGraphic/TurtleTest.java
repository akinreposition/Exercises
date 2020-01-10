package chapter7.TurtleGraphic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleTest {
	private Turtle myTurtle;
	private Pen biro;
	private SketchPad aPad;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		myTurtle = new Turtle();
		biro = new Pen();
		aPad = new SketchPad();
		myTurtle.setTurtlePen(biro);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void turtleExistsTest() {
		assertNotNull(myTurtle);
	}
	
	@Test
	void penNotNullTest() {
		assertNotNull(biro);
	}
	
	@Test
	void turtlePenNotNull() {
		myTurtle.setTurtlePen(biro);
		assertNotNull(myTurtle.getTurtlePen());
	}
	
	@Test
	void turtlePenPositionIsUp() {
		myTurtle.setTurtlePen(biro);
		assertNotNull(myTurtle.getTurtlePen().getPenPosition());
		assertEquals(Position.UP, myTurtle.getTurtlePen().getPenPosition());
	}
	
	@Test
	void turtleHasDirection() {
		assertNotNull(myTurtle.getTurtleOrientation());
	}
	
	@Test
	void turtleDirectionByDefaultIsRight() {
		assertNotNull(myTurtle.getTurtleOrientation());
		assertEquals(Orientation.COLUMN_RIGHT, myTurtle.getTurtleOrientation());
	}
	
	@Test
	void turtleDefaultCoordinatesAreZero() {
		assertNotNull(myTurtle);
		assertEquals(0, myTurtle.getColumnCoordinate());
		assertEquals(0, myTurtle.getRowCoordinate());
	}
	
	@Test
	void sketchpadExists() {
		assertNotNull(aPad);
	}
	
	@Test
	void sketchPadHasAFloor() {
		assertNotNull(aPad.getFloor());
	}
	
	@Test
	void changeTurtleDirection(){
		assertEquals(Orientation.COLUMN_RIGHT, myTurtle.getTurtleOrientation());
		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		assertEquals(Orientation.ROW_RIGHT, myTurtle.getTurtleOrientation());
	}
	
	@Test
	void changePenPosition() {
		assertEquals(Position.UP, biro.getPenPosition());
		biro.setPenPosition(Position.DOWN);
		assertEquals(Position.DOWN, biro.getPenPosition());
	}
	
	@Test
	void drawMovingForwardOnSketchPad() {
		myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
		myTurtle.draw(12, aPad);
		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[0][i]);
		}
	}
	
	@Test
	void drawMovingForwardAndTurnRightOnSketchPad() {
		myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
		myTurtle.draw(12, aPad);
		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[0][i]);
		}
		
		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		myTurtle.draw(12, aPad);
		assertEquals(11, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[i][11]);
		}
	}
	
	@Test
	void drawAndDisplaySketchPad() {
		myTurtle.getTurtlePen().setPenPosition(Position.DOWN);
		myTurtle.draw(12, aPad);
		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[0][i]);
		}
		
		myTurtle.setTurtleOrientation(Orientation.ROW_RIGHT);
		myTurtle.draw(12, aPad);
		assertEquals(11, myTurtle.getRowCoordinate());
		assertEquals(11, myTurtle.getColumnCoordinate());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[i][11]);
		}
		
		myTurtle.setTurtleOrientation(Orientation.COLUMN_LEFT);
		myTurtle.draw(12, aPad);
		assertEquals(11, myTurtle.getRowCoordinate());
		assertEquals(0, myTurtle.getColumnCoordinate());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[11][i]);
		}
		
		myTurtle.setTurtleOrientation(Orientation.ROW_LEFT);
		myTurtle.draw(12, aPad);
		assertEquals(0, myTurtle.getRowCoordinate());
		assertEquals(0, myTurtle.getColumnCoordinate());
		for(int i = 0; i < 12; i++) {
			assertEquals(1, aPad.getFloor()[i][0]);
		}
		
		for(int i = 0; i < aPad.getFloor().length; i++) {
			for(int j = 0; j < aPad.getFloor().length; j++) {
				if(aPad.getFloor()[i][j] == 0) {
					System.out.print("  ");
				} else if(aPad.getFloor()[i][j] == 1) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
}
