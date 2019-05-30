package tdd.intervalHierarchy;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import testBuilders.OpenIntervalBuilder;

public class OpenIntervalTest {
	@Test
	public void testIsNotIntersectedWhenMaxEqualsMin() {
		OpenInterval one = new OpenIntervalBuilder().min(3).max(14).build();
		OpenInterval another = new OpenIntervalBuilder().min(-1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
}
