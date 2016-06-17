package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;


public class BehaviorMonsterGhost extends Monster implements IStrategy{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {

		if(motionElement.moveUp()){
			
		}
		else if (motionElement.moveLeft()){
			
		}
		else if (motionElement.moveDown()){
			
		}
		else if (motionElement.moveRight()){
	
		}
		else if (motionElement.moveLeftUp()){
	
		}
		else if (motionElement.moveRightUp()){
			
		}
		else if (motionElement.moveLeftDown()){
	
		}
		else if (motionElement.moveRightDown()){
	
		}

}
	

}
