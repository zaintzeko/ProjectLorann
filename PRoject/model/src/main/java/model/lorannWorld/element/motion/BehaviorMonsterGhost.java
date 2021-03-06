package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class BehaviorMonsterGhost.
 */
public class BehaviorMonsterGhost extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {

		motionElement.savePosition();

		if(lorannWorld.getLorann().getY()<motionElement.getY()){
			motionElement.setY(motionElement.getY()-1);
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setY(motionElement.getY()-1);;
			}
		}

		if (lorannWorld.getLorann().getX()>motionElement.getX()){
			motionElement.setX(motionElement.getX()+1);
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setX(motionElement.getX()+1);
			}
		}

		if (lorannWorld.getLorann().getY()>motionElement.getY()){
			motionElement.setY(motionElement.getY()+1);
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setY(motionElement.getY()+1);
			}
		}

		if (lorannWorld.getLorann().getX()<motionElement.getX()){
			motionElement.setX(motionElement.getX()-1);
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setX(motionElement.getX()-1);
			}
		}

		motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY());
	}
}
