package tdd.intervalHierarchy;

public class EndPoint {
	Position position;
	
	private int value;
	private boolean open;
	
	public EndPoint(int value, boolean open) {
		this.value = value;
		this.open = open;
	}
	
	public Position getPositionFrom(EndPoint another) {
		if (another.getValue() == this.value && !this.open)
			return Position.TOP;
		if (another.getValue() > this.value)
			return Position.LEFT;
		if (another.getValue() < this.value)
			return Position.RIGHT;
		return null;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean getOpen() {
		return this.open;
	}
}
