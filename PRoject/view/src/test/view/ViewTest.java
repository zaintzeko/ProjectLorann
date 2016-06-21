package view;

import static org.junit.Assert.fail;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewTest.
 */
public class ViewTest {
	
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
	
	/** The test view. */
	private View testView;
	
	/** The key. */
	private int key;

	/** The i. */
	private IModel i;

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
	 * Test key code to controller order.
	 */
	@Test
	public void testKeyCodeToControllerOrder() {
		final int expected = 1 ;
		this.key = KeyEvent.VK_E;
		fail("not implemented");
		//assertEquals(expected, this.testView.keyCodeToControllerOrder(key).ordinal());
	}

}
