package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import testBuilders.IntervalBuilder;

public class OpenIntervalTest {
	@Test
	public void testIsNotIntersectedWhenMaxEqualsMinBothOpen() {
		Interval one = new IntervalBuilder().min(3).max(14).build();
		Interval another = new IntervalBuilder().min(-1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMaxEqualsMinOneOpenOneClosed() {
		Interval one = new IntervalBuilder().min(3).max(14).build();
		Interval another = new IntervalBuilder().min(-1).max(3).closed().build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMinEqualsMaxBothOpen() {
		Interval one = new IntervalBuilder().min(3).max(14).build();
		Interval another = new IntervalBuilder().min(14).max(16).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMinEqualsMaxOneOpenOneClosed() {
		Interval one = new IntervalBuilder().min(3).max(14).build();
		Interval another = new IntervalBuilder().min(14).max(16).closed().build();
		assertFalse(one.isIntersected(another));
	}
}
