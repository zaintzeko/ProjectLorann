package model.lorannWorld.element.motionless;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.lorannWorld.element.Permeability;

public class MotionlessElementTest {
	private static MotionlessElement testME;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testME = new MotionlessElement(null, Permeability.BLOCKING, 'o');
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPermeability() {
		assertEquals(Permeability.BLOCKING, testME.getPermeability());
	}

}
