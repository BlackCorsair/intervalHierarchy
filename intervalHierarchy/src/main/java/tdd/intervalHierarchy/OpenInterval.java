package tdd.intervalHierarchy;

public class OpenInterval extends Interval{

	public OpenInterval(double min, double max) {
		super(min, max);
	}
	
	@Override
	public boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}
}
