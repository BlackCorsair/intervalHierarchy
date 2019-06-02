package tdd.intervalHierarchy;
/*
 * This is an Utopy non-tested
 */
public class Interval {
	private EndPoint min;
	private EndPoint max;
	
	public Interval(EndPoint min, EndPoint max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean isIntersected(Interval another) {
		return isIncluded(another.getMax()) || isIncluded(another.getMin())
				|| min.getPositionFrom(another.getMin()) == Position.RIGHT
					&& max.getPositionFrom(another.getMax()) == Position.LEFT;
	}
	
	public boolean isIncluded(EndPoint point) {
		return min.getPositionFrom(point) == Position.LEFT
				&& max.getPositionFrom(point) == Position.RIGHT
				|| min.getPositionFrom(point) == Position.TOP
				|| max.getPositionFrom(point) == Position.TOP;
				
	}
	
	public EndPoint getMin() {
		return this.min;
	}
	
	public EndPoint getMax() {
		return this.max;
	}
}
