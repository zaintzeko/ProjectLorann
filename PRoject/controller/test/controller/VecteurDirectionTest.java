package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;



public class VecteurDirectionTest {
	private static VectorDirection testVector;
	
	public static void setUpBeforeClass() throws Exception {
		testVector = new VectorDirection();
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
	public void testChangeVecteurToImageNumber() {
		
	}

	@Test
	public void testGetVecteurX() {
		int expected = 1;
		this.testVector.setVectorX(1);
		assertEquals(expected, this.testVector.getVectorX());
		
	}

	@Test
	public void testGetVecteurY() {
		int expected = 1;
		this.testVector.setVectorY(1);
		assertEquals(expected, this.testVector.getVectorY());
	}

	@Test
	public void testGetNumberOfSpell() {
		int expected = 1;
		this.testVector.setNumberOfSpell(1);
		assertEquals(expected, this.testVector.getNumberOfSpell());
	}

}
