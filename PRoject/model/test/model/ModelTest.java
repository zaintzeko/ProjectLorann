package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {
	private static Model testModel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		testModel = new Model(1);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetLorannWorld() {
		assertNotNull(this.testModel.getLorannWorld());
	}

	@Test
	public void testGetObservable() {
		assertNotNull(this.testModel.getObservable());
	}

}
