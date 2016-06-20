package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class Monster.
 */
public abstract class Monster implements IStrategy{


	/* (non-Javadoc)
	 * @see contract.IStrategy#actionOnHit(contract.IMotionElement, contract.ILorannWorld)
	 */
	public void actionOnHit(final IMotionElement motionElement, final ILorannWorld lorannWorld) {
		lorannWorld.setWin(2);
	}
}
