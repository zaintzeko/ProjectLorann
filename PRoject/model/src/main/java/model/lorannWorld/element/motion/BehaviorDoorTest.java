package model.lorannWorld.element.motion;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import contract.ILorannWorld;
import contract.IStrategy;
import model.lorannWorld.LorannWorld;
import model.lorannWorld.element.Sprite;

public class BehaviorDoorTest {

	ILorannWorld l;

	@Before
	public void setUp() throws Exception {
		this.l = new LorannWorld();
		final IStrategy strat = new BehaviorDoor();
		final String sprites[] = {"DoorOpen.png", "DoorClose.png"};
		this.l.addElement(new Mobile(new Sprite(sprites), 'd', strat, this.l), 0, 0);
	}

	@Test
	public void test() {
		this.l.getMobileX(0).getStrategy().animate(this.l.getMobileX(0), this.l);
		final int expected = 1;
		assertEquals(expected, this.l.getMobileX(0).getSprite().getCurrentStep());
	}

}
