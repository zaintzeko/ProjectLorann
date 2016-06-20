package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;
import contract.IVecteurDirection;

public class BehaviorSpell implements IStrategy{
	private IVecteurDirection VecteurSpell;

	public void actionOnHit(final IMotionElement motionElement, final ILorannWorld lorannWorld) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {

		this.killMobile(motionElement,lorannWorld);

		motionElement.savePosition();
		if(motionElement.executeMoveIfPossible(motionElement.getX() - lorannWorld.getLorann().getXSpell(), motionElement.getY() - lorannWorld.getLorann().getYSpell())){
			motionElement.setX(motionElement.getX() - lorannWorld.getLorann().getXSpell());
			motionElement.setY(motionElement.getY() - lorannWorld.getLorann().getYSpell());
		}
		else {
			motionElement.setX(motionElement.getX()+ lorannWorld.getLorann().getXSpell());
			motionElement.setY(motionElement.getY() + lorannWorld.getLorann().getYSpell());
			lorannWorld.getLorann().setXSpell(-lorannWorld.getLorann().getXSpell());
			lorannWorld.getLorann().setYSpell(-lorannWorld.getLorann().getYSpell());
		}
		motionElement.getSprite().changeToNextImage();

		this.killMobile(motionElement,lorannWorld);
	}

	public IVecteurDirection getVecteurSpell() {
		return this.VecteurSpell;
	}
	private void killMobile(final IMotionElement motionElement,final ILorannWorld lorannWorld)
	{
		if(lorannWorld.removeMobile(motionElement.getX(), motionElement.getY()))
		{
			motionElement.setX(lorannWorld.getLorann().getX());
			motionElement.setY(lorannWorld.getLorann().getY());
		}
	}
}