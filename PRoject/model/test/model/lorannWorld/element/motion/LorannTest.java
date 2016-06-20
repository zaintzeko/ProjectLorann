package model.lorannWorld.element.motion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Observable;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionlessElement;
import contract.IVectorDirection;
import model.lorannWorld.element.Sprite;

public class LorannTest {
	private static String sprites[] = {"LorannUp.png", "LorannRightUp.png", "LorannRight.png", "LorannRightDown.png", "LorannDown.png", "LorannLeftDown.png", "LorannLeft.png", "LorannLeftUp.png"};
	private static ILorannWorld testLoran;
	private static Lorann testLorann;
	private static IVectorDirection testVector;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testVector = new IVectorDirection(){

			public int changeVecteurToImageNumber(IVectorDirection vecteur, int currentImage) {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getNumberOfSpell() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getVectorX() {
				// TODO Auto-generated method stub
				return 0;
			}

			public int getVectorY() {
				// TODO Auto-generated method stub
				return 0;
			}

			public void setNumberOfSpell(int numberOfSpell) {
				// TODO Auto-generated method stub
				
			}

			public void setVectorX(int vecteurX) {
				// TODO Auto-generated method stub
				
			}

			public void setVectorY(int vecteurY) {
				// TODO Auto-generated method stub
				
			}
			
		};
		testLoran = new ILorannWorld() {

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
		testLorann = new Lorann(new Sprite(sprites), 'L', testLoran);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetSpell() {
		this.testLorann.setSpell();
		assertNotNull(this.testLorann);
	}

	@Test
	public void testGetVectorOrder() {
		testLorann.setVectorOrder(testVector);
		assertNotNull(this.testLorann.getVectorOrder());
	}

	@Test
	public void testGetXSpell() {
		int expected = 0;
		assertEquals(expected, this.testLorann.getSaveX());
	}

	@Test
	public void testGetYSpell() {
		int expected = 0;
		assertEquals(expected, this.testLorann.getSaveX());
	}

}
