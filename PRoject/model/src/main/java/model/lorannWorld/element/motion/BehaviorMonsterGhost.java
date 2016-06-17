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
		else if (motionElement.MoveLeft()){
			
		}
		else if (motionElement.MoveDown()){
			
		}
		else if (motionElement.MoveRight()){
	
		}
		else if (motionElement.MoveLeftUp()){
	
		}
		else if (motionElement.MoveRightUp()){
			
		}
		else if (motionElement.MoveLeftDown()){
	
		}
		else if (motionElement.MoveRightDown()){
	
		}

}
	

}
