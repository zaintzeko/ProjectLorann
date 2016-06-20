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

public class ControllerTest {
	private static Controller testController;
	private static IView testView;
	private static IModel testModel;
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
