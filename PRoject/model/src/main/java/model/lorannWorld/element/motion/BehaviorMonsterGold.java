package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterGold extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {

		boolean a = false;
		motionElement.savePosition();
		if(lorannWorld.getLorann().getY()<motionElement.getY()){
			motionElement.setY(motionElement.getY()-1);
			a = motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY());
		}
		if ((lorannWorld.getLorann().getX()<motionElement.getX()) && !a){
			motionElement.setX(motionElement.getX()-1);
			a = motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY());
		}
		if ((lorannWorld.getLorann().getX()>motionElement.getX()) && !a){
			motionElement.setX(motionElement.getX()+1);
			a = motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY());
		}
		if ((lorannWorld.getLorann().getY()>motionElement.getY()) && !a){
			motionElement.setY(motionElement.getY()+1);
			a = motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY());
		}
	}
}
