package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterSkeleton extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {
		 
		boolean a = false;
		
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX() && !a){
			a = motionElement.moveLeftUp();
		}
		if (lorannWorld.getLorann().getY()<motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX() && !a){
			a = motionElement.moveRightUp();
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()<motionElement.getX() && !a){
			a = motionElement.moveLeftDown();
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY() && lorannWorld.getLorann().getX()>motionElement.getX() && !a){
			a = motionElement.moveRightDown();
		}
	}
}
