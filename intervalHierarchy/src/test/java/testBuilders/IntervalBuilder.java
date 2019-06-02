package testBuilders;

import tdd.intervalHierarchy.EndPoint;
import tdd.intervalHierarchy.Interval;

public class IntervalBuilder {

	private EndPoint min;
	private EndPoint max;
	
	public IntervalBuilder() {
		this.min = new EndPoint(0, false);
		this.max = new EndPoint(1, false);
	}

	public IntervalBuilder min(int min, boolean open) {
		this.min = new EndPoint(min, open);
		return this;
	}

	public IntervalBuilder max(int max, boolean open) {
		this.max = new EndPoint(max, open);
		return this;
	}
	
	public Interval build () {
		return new Interval(this.min, this.max);
	}
}
