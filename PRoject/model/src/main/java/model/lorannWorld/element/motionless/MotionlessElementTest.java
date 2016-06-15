package model.lorannWorld.element.motionless;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.lorannWorld.element.Permeability;

public class MotionlessElementTest {
	private MotionlessElement testME;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testME = new MotionlessElement(null, Permeability.BLOCKING);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPermeability() {
		assertEquals(Permeability.BLOCKING, testME.getPermeability());
	}

}
