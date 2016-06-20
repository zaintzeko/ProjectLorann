package view;

import static org.junit.Assert.fail;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;

public class ViewTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	private View testView;
	private int key;

	private IModel i;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKeyCodeToControllerOrder() {
		final int expected = 1 ;
		this.key = KeyEvent.VK_E;
		fail("not implemented");
		//assertEquals(expected, this.testView.keyCodeToControllerOrder(key).ordinal());
	}

}
