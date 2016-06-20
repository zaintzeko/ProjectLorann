package model.lorannWorld.element.motionless;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class MotionlessElementTest {
	private static MotionlessElement testME;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testME = new MotionlessElement(null, 'o');
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
}
