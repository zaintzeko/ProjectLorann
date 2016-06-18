package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterGold extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {

		if(lorannWorld.getLorann().getY()<motionElement.getY()){
			motionElement.moveUp();
		}
		else if (lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.moveLeft();
		}
		else if (lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRight();
		}
		else if (lorannWorld.getLorann().getY()>motionElement.getY()){
			motionElement.moveDown();
		}
		motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY());
	}
}
