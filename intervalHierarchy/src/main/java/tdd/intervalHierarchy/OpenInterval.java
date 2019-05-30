package tdd.intervalHierarchy;

public class OpenInterval extends Intervals{

	public OpenInterval(double min, double max) {
		super(min, max);
	}

	public boolean isIntersected(OpenInterval another) {
		return false;
	}
	
	

}
