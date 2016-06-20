package model.lorannWorld.element;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class SpriteTest.
 */
public class SpriteTest {
	
	/** The test sprite. */
	private static Sprite testSprite;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		final String nameImage[] = {"Kneepcap.png"};
		testSprite = new Sprite(nameImage);
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
	 * Test get sprite.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void testGetSprite() {
		assertNotNull(this.testSprite.getImage());
	}

}
