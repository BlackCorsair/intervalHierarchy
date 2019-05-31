package testBuilders;

import tdd.intervalHierarchy.ClosedInterval;
import tdd.intervalHierarchy.Interval;
import tdd.intervalHierarchy.OpenInterval;

public class IntervalBuilder {

	protected int min;
	protected int max;
	
	private boolean closed;

	public IntervalBuilder() {
		this.min = 0;
		this.max = 1;
		this.closed = false;
	}

	public IntervalBuilder closed() {
		this.closed = true;
		return this;
	}

	public IntervalBuilder min(int min) {
		this.min = min;
		return this;
	}

	public IntervalBuilder max(int max) {
		this.max = max;
		return this;
	}
	
	public Interval build () {
		if (this.closed)
			return new ClosedInterval(min, max);
		return new OpenInterval(min, max);
	}
}
