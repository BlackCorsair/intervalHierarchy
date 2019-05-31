package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import testBuilders.IntervalBuilder;

public class OpenIntervalTest {
	@Test
	public void testIsNotIntersectedWhenMaxEqualsMin() {
		Interval one = new IntervalBuilder().min(3).max(14).build();
		Interval another = new IntervalBuilder().min(-1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
}
