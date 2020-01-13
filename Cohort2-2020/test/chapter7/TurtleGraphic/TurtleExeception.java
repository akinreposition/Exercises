package chapter7.TurtleGraphic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TurtleExeception {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void turtleExceptionExistTest() {
		TurtleException problem = new TurtleException("Turtle has a problem");
		assertNotNull(problem);
	}
 
	@Test
	void turtleExceptionOverLoadingConstruct() {
		Exception rootcause = new Exception("Got");
		TurtleException p = new TurtleException("caused by Runtime Error", rootcause);
		assertNotNull(p);
	}
	
}
