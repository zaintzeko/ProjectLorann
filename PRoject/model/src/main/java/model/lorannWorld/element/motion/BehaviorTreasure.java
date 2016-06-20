package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class BehaviorTreasure.
 */
public class BehaviorTreasure implements IStrategy{
	
	/* (non-Javadoc)
	 * @see contract.IStrategy#actionOnHit(contract.IMotionElement, contract.ILorannWorld)
	 */
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
