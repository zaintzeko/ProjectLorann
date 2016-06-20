package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelTest.
 */
public class ModelTest {
	
	/** The test model. */
	private static Model testModel;
	
	/**
	 * Sets the up before class.
	 *
	 * @throws Exception the exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testModel = new Model(1);
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
	 * Test get lorann world.
	 */
	@Test
	public void testGetLorannWorld() {
		assertNotNull(this.testModel.getLorannWorld());
	}

	/**
	 * Test get observable.
	 */
	@Test
	public void testGetObservable() {
		assertNotNull(this.testModel.getObservable());
	}

}
