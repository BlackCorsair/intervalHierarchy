package tdd.intervalHierarchy;

public abstract class Intervals {
	protected double min;

	protected double max;

	public Intervals(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public boolean isIntersected(ClosedInterval another) {
		return this.isIncluded(another.min) || this.isIncluded(another.max) || another.isIncluded(this.min);
	}

	public boolean isIncluded(double value) {
		return true;
	}
}
