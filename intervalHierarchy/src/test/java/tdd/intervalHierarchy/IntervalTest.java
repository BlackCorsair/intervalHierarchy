package tdd.intervalHierarchy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tdd.intervalHierarchy.EndPoint;
import testBuilders.IntervalBuilder;

public class IntervalTest {
	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new EndPoint(1, false)).max(new EndPoint(7, false)).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new EndPoint(7, false)).max(new EndPoint(15, false)).build();
		assertTrue(one.isIntersected(another));
	}
}
