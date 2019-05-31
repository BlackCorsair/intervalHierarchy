package tdd.intervalHierarchy;

import javax.print.attribute.standard.MediaSize.Other;

public class OpenInterval extends Interval{

	public OpenInterval(double min, double max) {
		super(min, max);
	}
	
	@Override
	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.min) || this.isIncluded(another.max) || sameLength(another);
	}
	
	private boolean sameLength(Interval another) {
		return this.min == another.min && this.max == another.max;
	}
	
	@Override
	public boolean isIncluded(double value) {
		return this.min < value && value < this.max;
	}
}
