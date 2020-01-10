package chapter7.TurtleGraphic;

public class Pen {
	private Position penPosition = Position.UP;

	/**
	 * @return the penPosition
	 */
	public Position getPenPosition() {
		return penPosition;
	}

	/**
	 * @param penPosition the penPosition to set
	 */
	public void setPenPosition(Position penPosition) {
		this.penPosition = penPosition;
	}
}
