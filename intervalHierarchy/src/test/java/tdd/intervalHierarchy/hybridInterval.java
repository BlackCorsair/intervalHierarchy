package tdd.intervalHierarchy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import testBuilders.IntervalBuilder;

public class hybridInterval {
	@Test
	public void testIsNotIntersectedMinOpenEqualAnotherMin() {
		Interval one = new IntervalBuilder().min(3).max(14).build();
		Interval another = new IntervalBuilder().min(-2).max(4).build();
		assertTrue(one.isIntersected(another));
	}

}
