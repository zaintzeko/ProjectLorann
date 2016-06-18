package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorTreasure implements IStrategy{
	public void actionOnHit(final IMotionElement motionElement, final ILorannWorld lorannWorld) {
		lorannWorld.addScore(100);
	}

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {
		//nothing here
	}

}
