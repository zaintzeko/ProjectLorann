package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterGold extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {
		boolean a = false;
		
	/*	if(lorannWorld.getLorann().getY()<motionElement.getY()){
			a = motionElement.moveUp();
		}
		if (lorannWorld.getLorann().getX()<motionElement.getX()){
			a = motionElement.moveLeft();
		}
		if (lorannWorld.getLorann().getX()>motionElement.getX()){
			a = motionElement.moveRight();
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY()){
			a = motionElement.moveDown();
		}*/
	}
}
