package model.lorannWorld.element.motion;

import static org.junit.Assert.*;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Observable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionlessElement;
import contract.ISprite;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionElementTest.
 */
public class MotionElementTest {
		
	/** The test motion. */
	
	private static ISprite testSprite = new ISprite() {

		public void changecurentImage(int x) {
			// TODO Auto-generated method stub
			
		}

		public void changeToNextImage() {
			// TODO Auto-generated method stub
			
		}

		public Image getImage() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getCurrentStep() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	};
	private static ILorannWorld testLorann = new ILorannWorld(){
	
		public void addElement(IMobile motionElement, int x, int y) {
			// TODO Auto-generated method stub
			
		}

		public void addElement(IMotionlessElement motionlessElement, int x, int y) {
			// TODO Auto-generated method stub
			
		}

		public void addScore(int x) {
			// TODO Auto-generated method stub
			
		}

		public IMotionlessElement getElement(int x, int y) {
			// TODO Auto-generated method stub
			return null;
		}

		public IMotionlessElement[][] getElements() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getHeight() {
			// TODO Auto-generated method stub
			return 0;
		}

		public ILorann getLorann() {
			// TODO Auto-generated method stub
			return null;
		}

		public IMobile getMobileX(int x) {
			// TODO Auto-generated method stub
			return null;
		}

		public ArrayList<IMobile> getMotionElements() {
			// TODO Auto-generated method stub
			return null;
		}

		public Observable getObservable() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getScore() {
			// TODO Auto-generated method stub
			return 0;
		}

		public int getWidth() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void play() {
			// TODO Auto-generated method stub
			
		}

		public boolean removeMobile(int x, int y) {
			// TODO Auto-generated method stub
			return false;
		}

		public void setWin(int win) {
			// TODO Auto-generated method stub
			
		}

		public void addElement(ILorann lorann, int x, int y) {
			// TODO Auto-generated method stub
			
		}
		
	};
	// Seems like Decorator ? 
	private MotionElement testMotion = new Lorann(testSprite, 'L', testLorann);
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
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
	 * Test element motion.
	 */
	@Test
	public void testElementMotion() {
		
	}

	/**
	 * Test execute move if possible.
	 */
	@Test
	public void testExecuteMoveIfPossible() {
		assertEquals(true, this.testMotion.executeMoveIfPossible(0, 0));
	}
	
	/**
	 * Test get lorann world.
	 */
	@Test
	public void testGetLorannWorld() {
		assertNotNull(this.testMotion.getLorannWorld());
	}

	/**
	 * Test get save X.
	 */
	@Test
	public void testGetSaveX() {
		int expected = 1;
		this.testMotion.setSaveX(1);
		assertEquals(1,this.testMotion.getSaveX());
	}

	/**
	 * Test get save Y.
	 */
	@Test
	public void testGetSaveY() {
		int expected = 1;
		this.testMotion.setSaveY(1);
		assertEquals(1,this.testMotion.getSaveY());
	}

	/**
	 * Test get X.
	 */
	@Test
	public void testGetX() {
		int expected = 1;
		this.testMotion.setX(1);
		assertEquals(1,this.testMotion.getX());
	}

	/**
	 * Test get Y.
	 */
	@Test
	public void testGetY() {
		int expected = 1;
		this.testMotion.setY(1);
		assertEquals(1,this.testMotion.getY());
	}

	/**
	 * Test save position.
	 * @throws Exception 
	 */
	@Test
	public void testSavePosition() throws Exception {
		this.testMotion.setX(1);
		this.testMotion.setY(1);
		this.testMotion.setSaveX(2);
		this.testMotion.setSaveY(2);
		this.testMotion.savePosition();
		int expected = 1;
		assertEquals(expected, this.testMotion.getSaveX());
		assertEquals(expected, this.testMotion.getSaveY());
	}

}
