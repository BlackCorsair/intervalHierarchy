package tdd.intervalHierarchy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new EndPoint(0, false)).max(new EndPoint(17, false)).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new EndPoint(5, false)).max(new EndPoint(10, false)).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new EndPoint(0, false)).max(new EndPoint(2, false)).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().min(new EndPoint(3, false)).max(new EndPoint(14, false)).build();
		Interval another = new IntervalBuilder().min(new EndPoint(16, false)).max(new EndPoint(22, false)).build();
		assertFalse(one.isIntersected(another));
	}
}
