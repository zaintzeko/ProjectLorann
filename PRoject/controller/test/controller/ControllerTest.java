package controller;

import static org.junit.Assert.*;

import java.util.Observable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import contract.ILorannWorld;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class ControllerTest.
 */
public class ControllerTest {
	
	/** The test controller. */
	private static Controller testController;
	
	/** The test view. */
	private static IView testView;
	
	/** The test model. */
	private static IModel testModel;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	public static void setUpBeforeClass() throws Exception {
		testView= new IView(){
			public void printMessage(String message) {
			}
		};
		testModel = new IModel() {

			public ILorannWorld getLorannWorld() {
				// TODO Auto-generated method stub
				return null;
			}
			public Observable getObservable() {
				return new Observable();
			}
		};
		Controller testController = new Controller(testView, testModel);
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
	 * Test get vecteur order.
	 */
	@Test
	public void testGetVecteurOrder() {
		assertNotNull(this.testController);
	}

	/**
	 * Test order perform.
	 */
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
