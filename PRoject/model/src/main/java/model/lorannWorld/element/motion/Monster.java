package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public abstract class Monster implements IStrategy{


	public void actionOnHit(final IMotionElement motionElement, final ILorannWorld lorannWorld) {
		lorannWorld.setWin(2);
		lorannWorld.addScore(100);
	}
}
