package model.lorannWorld;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ControllerOrder;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionElement;
import contract.ISprite;
import contract.IVecteurDirection;

public class LorannWorldTest {
	private static LorannWorld testLoran;
	private static ILorann Lorann;
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

			public IVecteurDirection getVecteurOrder() {
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

			public void setKeyCode(ControllerOrder keyCode) {
				// TODO Auto-generated method stub
				
			}

			public void setSpell() {
				// TODO Auto-generated method stub
				
			}

			public void setVecteurOrder(IVecteurDirection vecteurOrder) {
				// TODO Auto-generated method stub
				
			}

			public void setXSpell(int Xspell) {
				// TODO Auto-generated method stub
				
			}
			public void setYSpell(int YSpell) {

			}	
		};
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

	@SuppressWarnings("static-access")
	@Test
	public void testGetWidth() {
		final int expected = 20;
		assertEquals(expected, this.testLoran.getWidth());
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetHeight() {
		final int expected = 12;
		assertEquals(expected, this.testLoran.getHeight());
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionlessElements() {
		for(int i =0; i < this.testLoran.getWidth(); i++){
			for( int y = 0; y < this.testLoran.getHeight(); y++){
				assertNotNull(this.testLoran.getElements());
			}
		}
	}

	@SuppressWarnings("static-access")
	@Test
	public void testGetMotionElements() {
		for(int i = 0; i < this.testLoran.getMotionElements().size(); i++){
			
		
		assertNotNull(this.testLoran.getMotionElements().get(i));
		}	
	}
	
	@Test
	public void testGetObservable() {
		assertNotNull(this.testLoran.getObservable());
	}
	@Test
	public void testGetMobileX() {
		for(int i =0 ; i < this.testLoran.getMotionElements().size(); i++)
		assertNotNull(this.testLoran.getMobileX(i));
	}
	@Test
	public void testGetLorann() {
		this.testLoran.setLorann(Lorann);
		assertNotNull(this.testLoran.getLorann());
	}
	@Test
	public void testGetScore() {
		this.testLoran.addScore(1);
		int expected = 1;
		assertEquals(expected, this.testLoran.getScore());
	}

}
