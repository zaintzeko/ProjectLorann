package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterGhost extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {

		if(lorannWorld.getLorann().getY()<motionElement.getY()){
			motionElement.moveUp();
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.moveUp();
			}
		}

		if (lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.moveRight();
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.moveRight();
			}
		}

		if (lorannWorld.getLorann().getY()>motionElement.getY()){
			motionElement.moveDown();
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.moveDown();
			}
		}

		if (lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.moveLeft();
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.moveLeft();
			}
		}

		motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY());
	}
}
