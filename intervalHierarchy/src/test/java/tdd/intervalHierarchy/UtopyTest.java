package tdd.intervalHierarchy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tdd.intervalHierarchy.EndPoint;

public class UtopyTest {
	@Test
	public void testIsIntersectedOverlapingByLeft() {
		IntervalEndPoints one = new IntervalEndPoints(new EndPoint(3, false), new EndPoint(14, false));
		IntervalEndPoints another = new IntervalEndPoints(new EndPoint(1, false), new EndPoint(7, false));
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		IntervalEndPoints one = new IntervalEndPoints(new EndPoint(3, false), new EndPoint(14, false));
		IntervalEndPoints another = new IntervalEndPoints(new EndPoint(7, false), new EndPoint(15, false));
		assertTrue(one.isIntersected(another));
	}
}
