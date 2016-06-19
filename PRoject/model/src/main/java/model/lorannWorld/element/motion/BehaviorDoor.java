package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorDoor implements IStrategy{
	public void actionOnHit(final IMotionElement motionElement, final ILorannWorld lorannWorld) {
		if(motionElement.getSprite().getCurrentStep() == 0){
			lorannWorld.setWin(2);
		}
		else {
			lorannWorld.setWin(1);
		}
	}

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {
		boolean isKeyExist = false;
		for(final IMobile mobile : lorannWorld.getMotionElements())
		{
			if(mobile.getSymbole() == 'k')
			{
				isKeyExist = true;
			}
		}
		if(!isKeyExist)
		{
			motionElement.getSprite().changecurentImage(1);
		}
	}

}
