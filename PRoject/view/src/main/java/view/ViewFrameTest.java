package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import contract.IModel;
public class ViewFrameTest {
	private ViewFrame testFrame;
	private KeyEvent e;
	private int key;
	private IModel model;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//model = new IModel();
		testFrame = new ViewFrame(model);
		e = new KeyEvent(testFrame, KeyEvent.VK_A, 0, 0, 0);
		key = KeyEvent.VK_A;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKeyTyped() {
		testFrame.keyPressed(e);
		assertEquals("La touche appuyé correspond à la touche renvoyé",key, e.getID());
	}

	@Test
	public void testKeyPressed() {
		testFrame.keyPressed(e);
		assertEquals("La touche enfoncé correspond à la touche renvoyé",key, e.getID());
		
	}

	@Test
	public void testKeyReleased() {
		testFrame.keyPressed(e);
		assertEquals("La touche relevé correspond à la touche renvoyé",key, e.getID());
	}

}
