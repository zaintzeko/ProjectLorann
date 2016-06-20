package model.lorannWorld;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionElement;
import contract.ISprite;
import contract.IVectorDirection;
import contract.IVectorDirection;

// TODO: Auto-generated Javadoc
/**
 * The Class LorannWorldTest.
 */
public class LorannWorldTest {
	
	/** The test loran. */
	private static LorannWorld testLoran;
	
	/** The Lorann. */
	private static ILorann Lorann;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testLoran = new LorannWorld(20,12);
		Lorann = new ILorann() {

			public Boolean executeMoveIfPossible(int x, int y) {
				// TODO Auto-generated method stub
				return null;
			}

			public ILorannWorld getLorannWorld() {
				// TODO Auto-generated method stub
				return null;
			}

			public int getSaveX() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getSaveY() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getX() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getY() {
				// TODO Auto-generated method stub
				return 0;
			}

			public void killElement(IMotionElement motionElement) {
				// TODO Auto-generated method stub
				
			}

			public void moveDown() {
				// TODO Auto-generated method stub
				
			}

			public void moveLeft() {
				// TODO Auto-generated method stub
				
			}

			public void moveLeftDown() {
				// TODO Auto-generated method stub
				
			}

			public void moveLeftUp() {
				// TODO Auto-generated method stub
				
			}

			public void moveRight() {
				// TODO Auto-generated method stub
				
			}

			public void moveRightDown() {
				// TODO Auto-generated method stub
				
			}

			public void moveRightUp() {
				// TODO Auto-generated method stub
				
			}

			public void moveUp() {
				// TODO Auto-generated method stub
				
			}

			public void savePosition() {
				// TODO Auto-generated method stub
				
			}

			public void setSaveX(int saveX) {
				// TODO Auto-generated method stub
				
			}

			public void setSaveY(int saveX) {
				// TODO Auto-generated method stub
				
			}

			public void setX(int x) {
				// TODO Auto-generated method stub
				
			}

			public void setY(int y) {
				// TODO Auto-generated method stub
				
			}

			public ISprite getSprite() {
				// TODO Auto-generated method stub
				return null;
			}

			public char getSymbole() {
				// TODO Auto-generated method stub
				return 0;
			}

			public void animate() {
				// TODO Auto-generated method stub
				
			}

			public IMobile getSpell() {
				// TODO Auto-generated method stub
				return null;
			}

			public IVectorDirection getVectorOrder() {
				// TODO Auto-generated method stub
				return null;
			}

			public int getXSpell() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getYSpell() {
				// TODO Auto-generated method stub
				return 0;
			}

			

			public void setSpell() {
				// TODO Auto-generated method stub
				
			}

			public void setVecteurOrder(IVectorDirection vecteurOrder) {
				// TODO Auto-generated method stub
				
			}

			public void setXSpell(int Xspell) {
				// TODO Auto-generated method stub
				
			}
			public void setYSpell(int YSpell) {

			}

			public void setVectorOrder(IVectorDirection vectorOrder) {
				// TODO Auto-generated method stub
				
			}	
		};
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
	 * Test get width.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetWidth() {
		final int expected = 20;
		assertEquals(expected, this.testLoran.getWidth());
	}

	/**
	 * Test get height.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetHeight() {
		final int expected = 12;
		assertEquals(expected, this.testLoran.getHeight());
	}

	/**
	 * Test get motionless elements.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionlessElements() {
		for(int i =0; i < this.testLoran.getWidth(); i++){
			for( int y = 0; y < this.testLoran.getHeight(); y++){
				assertNotNull(this.testLoran.getElements());
			}
		}
	}

	/**
	 * Test get motion elements.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionElements() {
		for(int i = 0; i < this.testLoran.getMotionElements().size(); i++){
			
		
		assertNotNull(this.testLoran.getMotionElements().get(i));
		}	
	}
	
	/**
	 * Test get observable.
	 */
	@Test
	public void testGetObservable() {
		assertNotNull(this.testLoran.getObservable());
	}
	
	/**
	 * Test get mobile X.
	 */
	@Test
	public void testGetMobileX() {
		for(int i =0 ; i < this.testLoran.getMotionElements().size(); i++)
		assertNotNull(this.testLoran.getMobileX(i));
	}
	
	/**
	 * Test get lorann.
	 */
	@Test
	public void testGetLorann() {
		this.testLoran.setLorann(Lorann);
		assertNotNull(this.testLoran.getLorann());
	}
	
	/**
	 * Test get score.
	 */
	@Test
	public void testGetScore() {
		this.testLoran.addScore(1);
		int expected = 1;
		assertEquals(expected, this.testLoran.getScore());
	}

}
