package controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Observable;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IModel;
import contract.IMotionElement;
import contract.IMotionlessElement;
import contract.ISprite;
import contract.IVectorDirection;
import contract.IView;

public class ControllerTest {
	private static Controller testController;
	private static IView testView;
	private static IModel testModel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		testView = new IView() {
			public void printMessage(String message) {
			}
		};
		testModel = new IModel() {

			public ILorannWorld getLorannWorld() {
				return new ILorannWorld(){

					public void addElement(IMobile motionElement, int x, int y) {	
					}

					public void addElement(IMotionlessElement motionlessElement, int x, int y) {	
					}

					public void addScore(int x) {

					}

					public IMotionlessElement getElement(int x, int y) {

						return null;
					}

					public IMotionlessElement[][] getElements() {
						return null;
					}

					public int getHeight() {
						return 0;
					}

					public ILorann getLorann() {
						return new ILorann(){

							public Boolean executeMoveIfPossible(int x, int y) {
								return null;
							}

							public ILorannWorld getLorannWorld() {
								return null;
							}

							public int getSaveX() {
								return 0;
							}

							public int getSaveY() {
								return 0;
							}

							public int getX() {
								return 0;
							}

							public int getY() {
								return 0;
							}

							public void killElement(IMotionElement motionElement) {
							}

							public void savePosition() {
							}

							public void setSaveX(int saveX) {
							}

							public void setSaveY(int saveX) {
							}

							public void setX(int x) {
							}

							public void setY(int y) {
							}

							public ISprite getSprite() {
								return null;
							}

							public char getSymbole() {
								return 0;
							}

							public void animate() {
								
							}

							public IMobile getSpell() {
								return null;
							}

							public IVectorDirection getVectorOrder() {
								return null;
							}

							public int getXSpell() {
								return 0;
							}

							public int getYSpell() {
								return 0;
							}

							public void setSpell() {
								
							}

							public void setVectorOrder(IVectorDirection vectorOrder) {
								
							}

							public void setXSpell(int Xspell) {
							}

							public void setYSpell(int YSpell) {
							}
							
						};
					}

					public IMobile getMobileX(int x) {
						return null;
					}

					public ArrayList<IMobile> getMotionElements() {
						return null;
					}

					public Observable getObservable() {

						return new Observable();
					}

					public int getScore() {

						return 0;
					}

					public int getWidth() {
						return 0;
					}

					public void play() {
					}

					public boolean removeMobile(int x, int y) {
						return false;
					}

					public void setWin(int win) {
						
					}

					public void addElement(ILorann lorann, int x, int y) {
						
					}
					
				};
			}

			public Observable getObservable() {
				return new Observable();
			}
			
		};
		testController = new Controller(testView, testModel);
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetVecteurOrder() {
		assertNotNull(this.testController);
		
	}

	@Test
	public void testOrderPerform() {
		this.testController.orderPerform(1, 2, 3);
		int expected =1;
		int expected2 = 2;
		int expected3 = 3;
		assertEquals(expected, this.testController.getVecteurOrder().getVectorX());
		assertEquals(expected2, this.testController.getVecteurOrder().getVectorY());
		assertEquals(expected3, this.testController.getVecteurOrder().getNumberOfSpell());
	}

}
