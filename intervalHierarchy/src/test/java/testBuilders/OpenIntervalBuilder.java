package testBuilders;

import tdd.intervalHierarchy.OpenInterval;

public class OpenIntervalBuilder {
	private double min;

	private double max;

	public OpenIntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}

	public OpenIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	public OpenIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}

	public OpenInterval build() {
		assert min <= max;
		return new OpenInterval(min, max);
	}
}
