package testBuilders;

import tdd.intervalHierarchy.EndPoint;
import tdd.intervalHierarchy.Interval;

public class IntervalBuilder {

	private EndPoint min;
	private EndPoint max;
	
	private boolean closed;

	public IntervalBuilder() {
		this.min = new EndPoint(0,false);
		this.max = new EndPoint(1,false);
		this.closed = false;
	}

	public IntervalBuilder closed() {
		this.closed = true;
		return this;
	}

	public IntervalBuilder min(EndPoint min) {
		this.min = min;
		return this;
	}

	public IntervalBuilder max(EndPoint max) {
		this.max = max;
		return this;
	}
	
	public Interval build () {
		return new Interval(this.min, this.max);
	}
}
