package hw5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuildingTest {
	
	int [] a;
	@Before
	public void setUp() throws Exception {
		a = new int [] {2,3,4};
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSearch() {
		fail("Not yet implemented"); // TODO
	}
	
	@Test
	public final void testSearchNoItem() {
		boolean val = (new Building(100,"8th Street")).search(a, 3);
		assertFalse(val);
	}

}
