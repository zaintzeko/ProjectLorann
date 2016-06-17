package model.lorannWorld.element;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpriteTest {
	private static Sprite testSprite;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		final String nameImage[] = {"Kneepcap.png"};
		testSprite = new Sprite(nameImage);
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

	@SuppressWarnings("static-access")
	@Test
	public void testGetSprite() {
		assertNotNull(this.testSprite.getImage());
	}

}
