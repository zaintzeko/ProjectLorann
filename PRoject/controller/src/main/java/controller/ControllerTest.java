package controller;

import static org.junit.Assert.*;

import java.util.Observable;

import javax.swing.text.View;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.ILorannWorld;
import contract.IModel;
import contract.IView;

public class ControllerTest {
	
	private static Controller testController;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		IView testView = new IView() {

			public void printMessage(String message) {
			}
		};
		IModel testModel = new IModel() {
			public ILorannWorld getLorannWorld() {
				return null;
			}

			public Observable getObservable() {
				return new Observable();
			}
			
		};
		testController = new Controller(testView, testModel);
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
	public void testController() {
	//	assertNotNull(this.testController.)
	}

	@Test
	public void testOrderPerform() {
		fail("Not yet implemented");
	}

}
