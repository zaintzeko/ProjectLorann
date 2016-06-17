package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;


public class BehaviorMonsterGhost extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {

		if(motionElement.MoveUp()){
			
		}
	}

}
