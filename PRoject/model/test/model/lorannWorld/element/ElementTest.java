package model.lorannWorld.element;

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
import model.lorannWorld.element.motion.Lorann;

public class ElementTest {
	private static Element testElement;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 testElement = new Lorann(new ISprite() {

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
				
			}, 'L', new ILorannWorld(){

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
				
			});
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
	public void testGetSprite() {
		assertNotNull(this.testElement.getSprite());
	}

	@Test
	public void testGetSymbole() {
		assertEquals('L', this.testElement.getSymbole());
	}


}
