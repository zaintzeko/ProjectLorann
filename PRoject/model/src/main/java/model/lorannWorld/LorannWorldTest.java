package model.lorannWorld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LorannWorldTest {
	private LorannWorld testLoran;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.testLoran = new LorannWorld(1,10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetWidth() {
		final int expected = 1;
		assertEquals(expected, this.testLoran.getWidth());
	}

	@Test
	public void testGetHeight() {
		final int expected = 10;
		assertEquals(expected, this.testLoran.getHeight());
	}

	@Test
	public void testGetElement() {
		for(int i =0; i < this.testLoran.getWidth(); i++){
			for( int y = 0; y < this.testLoran.getHeight(); y++){
				assertNotNull(this.testLoran.getElement(i, y));
			}
		}
		
	}

	@Test
	public void testGetMotionlessElements() {
		for(int i =0; i < this.testLoran.getWidth(); i++){
			for( int y = 0; y < this.testLoran.getHeight(); y++){
				assertNotNull(this.testLoran.getMotionlessElements());
			}
		}
	}

	@Test
	public void testGetMotionElements() {
		assertNotNull(this.testLoran.getMotionElements());
			
	}

}
