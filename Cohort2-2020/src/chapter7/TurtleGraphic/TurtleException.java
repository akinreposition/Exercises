/**
 * 
 */
package chapter7.TurtleGraphic;

/**
 * @author user
 *
 */
public class TurtleException extends Exception {

	public TurtleException(String errorMessage) {
		super(errorMessage);
	}
	
	public TurtleException(String message, Exception theProblem) {
		super(message, theProblem);
	}
}
