package model.lorannWorld.element.motion;

import java.util.Random;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterTotem extends Monster implements IStrategy{
	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {
		motionElement.savePosition();
		Random rand = new Random();
		int Nomber = rand.nextInt(8);
		
		
		switch(Nomber){
		case 0:
		

			break;
		case 1:
	
			break;
		case 2:

			break;
		case 3:
		
			break;
		case 4:
	
			break;
		case 5:
		
			
			break;
		case 6:
	
			break;
		case 7:
		
			default:
		}
	}
}
