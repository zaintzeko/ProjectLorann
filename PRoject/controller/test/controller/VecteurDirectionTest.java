package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;



public class VecteurDirectionTest {
	private static VecteurDirection testVecteur;
	
	public static void setUpBeforeClass() throws Exception {
		testVecteur = new VecteurDirection();
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
		this.testVecteur.setVecteurX(1);
		assertEquals(expected, this.testVecteur.getVecteurX());
		
	}

	@Test
	public void testGetVecteurY() {
		int expected = 1;
		this.testVecteur.setVecteurY(1);
		assertEquals(expected, this.testVecteur.getVecteurY());
	}

	@Test
	public void testGetNumberOfSpell() {
		int expected = 1;
		this.testVecteur.setNumberOfSpell(1);
		assertEquals(expected, this.testVecteur.getNumberOfSpell());
	}

}
