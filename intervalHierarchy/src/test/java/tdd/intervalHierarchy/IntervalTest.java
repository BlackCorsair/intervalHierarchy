package tdd.intervalHierarchy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tdd.intervalHierarchy.EndPoint;
import testBuilders.IntervalBuilder;

public class IntervalTest {
	
	// closed interval tests
	@Test
	public void testIsIntersectedOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(3, false).max(14, false).build();
		Interval another = new IntervalBuilder().min(1, false).max(7, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByRight() {
		Interval one = new IntervalBuilder().min(3, false).max(14, false).build();
		Interval another = new IntervalBuilder().min(7, false).max(15, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByEquals() {
		Interval one = new IntervalBuilder().min(3, false).max(14, false).build();
		Interval another = new IntervalBuilder().min(3, false).max(14, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByBoth() {
		Interval one = new IntervalBuilder().min(3, false).max(14, false).build();
		Interval another = new IntervalBuilder().min(0, false).max(17, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlapingByInside() {
		Interval one = new IntervalBuilder().min(3, false).max(14, false).build();
		Interval another = new IntervalBuilder().min(5, false).max(10, false).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByLeft() {
		Interval one = new IntervalBuilder().min(3, false).max(14, false).build();
		Interval another = new IntervalBuilder().min(0, false).max(2, false).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedNotOverlapingByRight() {
		Interval one = new IntervalBuilder().min(3, false).max(14, false).build();
		Interval another = new IntervalBuilder().min(16, false).max(22, false).build();
		assertFalse(one.isIntersected(another));
	}
	
	// open interval tests
	@Test
	public void testIsNotIntersectedWhenMaxEqualsMinBothOpen() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(-1, true).max(3, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMaxEqualsMinOneOpenOneClosed() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(-1, true).max(3, false).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMinEqualsMaxBothOpen() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(14, true).max(16, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMinEqualsMaxOneOpenOneClosed() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(14, false).max(16, false).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMaxLessMax() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(15, true).max(16, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWhenMinMoreMax() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(0, true).max(2, true).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedWhenOverlapingLeft() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(-2, true).max(4, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedWhenOverlapingRight() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(4, true).max(44, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedWhenBothAreTheSame() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(3, true).max(14, true).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedWhenOtherBigger() {
		Interval one = new IntervalBuilder().min(3, true).max(14, true).build();
		Interval another = new IntervalBuilder().min(2, true).max(15, true).build();
		assertTrue(one.isIntersected(another));
	}
}
