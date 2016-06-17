package model.lorannWorld.element.motion;

import contract.ILorannWorld;

public interface IStrategy {
	public void actionOnHit();
	public void animate(MotionElement motionElement,ILorannWorld lorannWorld);
}
