package model.lorannWorld.element;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpriteTest {
	private Sprite testSprite;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		testSprite = new Sprite(null);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetSprite() {
		assertNotNull(this.testSprite.getSprite());
	}

}
