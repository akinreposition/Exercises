package chapter7.TurtleGraphic;

import java.util.logging.Logger;

/**
 * @author akin
 *
 */
public class Turtle {
	private Logger logger = Logger.getLogger(Turtle.class.getName());
	
	private Pen turtlePen;
	private Orientation turtleOrientation = Orientation.COLUMN_RIGHT;
	private int columnCoordinate;
	private int rowCoordinate;
	
	/**
	 * @return the turtlePen
	 */
	public Pen getTurtlePen() {
		return turtlePen;
	}

	/**
	 * @param turtlePen the turtlePen to set
	 */
	public void setTurtlePen(Pen turtlePen) {
		this.turtlePen = turtlePen;
	}

	/**
	 * @return the turtleDirection
	 */
	public Orientation getTurtleOrientation() {
		return turtleOrientation;
	}

	/**
	 * @param turtleDirection the turtleDirection to set
	 */
	public void setTurtleOrientation(Orientation turtleDirection) {
		this.turtleOrientation = turtleDirection;
	}

	/**
	 * @return the columnCoordinate
	 */
	public int getColumnCoordinate() {
		return columnCoordinate;
	}

	/**
	 * @param columnCoordinate the columnCoordinate to set
	 */
	public void setColumnCoordinate(int columnCoordinate) {
		this.columnCoordinate = columnCoordinate;
	}

	/**
	 * @return the rowCoordinate
	 */
	public int getRowCoordinate() {
		return rowCoordinate;
	}

	/**
	 * @param rowCoordinate the rowCoordinate to set
	 */
	public void setRowCoordinate(int rowCoordinate) {
		this.rowCoordinate = rowCoordinate;
	}

	public void draw1(int numberOfSteps, SketchPad drawingPad) throws TurtleException {
		boolean drawingPadValidated = TurtleValidator.isValidSketchPad(drawingPad);
		if(!drawingPadValidated) {
			String errorMessage = "Sketchpad for the turtle to draw on cannot be null";
			logger.severe(errorMessage);
			throw new TurtleException(errorMessage);
		}
		
		int floorBoundary = drawingPad.getFloor().length;
		int currentCoordinate = this.columnCoordinate;
		if(this.turtleOrientation == Orientation.ROW_LEFT || this.turtleOrientation == Orientation.ROW_RIGHT) {
			currentCoordinate = this.rowCoordinate;
		}
		
		boolean numberOfStepsValidated = TurtleValidator.isValidNumberOfSteps(numberOfSteps, floorBoundary, currentCoordinate, this.turtleOrientation);
		if(!numberOfStepsValidated) {
			String errorMessage = "Method draw was called with invalid number of steps " + numberOfSteps;
			logger.info(errorMessage);
			throw new TurtleException(errorMessage);
		}
		
		for(int i = 0; i < numberOfSteps; i++) {
			drawingPad.getFloor()[this.rowCoordinate][this.columnCoordinate] = 1;
			if(this.turtleOrientation == Orientation.COLUMN_RIGHT && i != numberOfSteps-1) {
				this.columnCoordinate++;
			} else if(this.turtleOrientation == Orientation.ROW_RIGHT && i != numberOfSteps-1){
				this.rowCoordinate++;
			} else if(this.turtleOrientation == Orientation.COLUMN_LEFT && i != numberOfSteps-1){
				this.columnCoordinate--;
			} else if(this.turtleOrientation == Orientation.ROW_LEFT && i != numberOfSteps-1){
				this.rowCoordinate--;
			}
		}
	} 
	public void draw(int i, SketchPad aPad) {
		
	}

	
}
