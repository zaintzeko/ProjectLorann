package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;



// TODO: Auto-generated Javadoc
/**
 * The Class VecteurDirectionTest.
 */
public class VectorDirectionTest {
	
	/** The test vector. */
	private static VectorDirection testVector;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Tear down after class.
	 *
	 * @throws Exception the exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		testVector = new VectorDirection();
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test get vecteur X.
	 */
	@Test
	public void testGetVectorX() {
		int expected = 1;
		this.testVector.setVectorX(1);
		assertEquals(expected, this.testVector.getVectorX());
		
	}

	/**
	 * Test get vecteur Y.
	 */
	@Test
	public void testGetVectorY() {
		int expected = 1;
		this.testVector.setVectorY(1);
		assertEquals(expected, this.testVector.getVectorY());
	}

	/**
	 * Test get number of spell.
	 */
	@Test
	public void testGetNumberOfSpell() {
		int expected = 1;
		this.testVector.setNumberOfSpell(1);
		assertEquals(expected, this.testVector.getNumberOfSpell());
	}

}
