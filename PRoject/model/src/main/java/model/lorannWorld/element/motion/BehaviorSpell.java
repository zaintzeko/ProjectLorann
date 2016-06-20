package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;
import contract.IVectorDirection;

// TODO: Auto-generated Javadoc
/**
 * The Class BehaviorSpell.
 */
public class BehaviorSpell implements IStrategy{
	
	/** The Vecteur spell. */
	private IVectorDirection VecteurSpell;

	/* (non-Javadoc)
	 * @see contract.IStrategy#actionOnHit(contract.IMotionElement, contract.ILorannWorld)
	 */
	public void actionOnHit(final IMotionElement motionElement, final ILorannWorld lorannWorld) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {

		motionElement.savePosition();

		this.killMobile(motionElement,lorannWorld);
		if(!motionElement.executeMoveIfPossible(motionElement.getX() - lorannWorld.getLorann().getXSpell(), motionElement.getY() - lorannWorld.getLorann().getYSpell())){
			lorannWorld.getLorann().setXSpell(-lorannWorld.getLorann().getXSpell());
			lorannWorld.getLorann().setYSpell(-lorannWorld.getLorann().getYSpell());
		}
		motionElement.getSprite().changeToNextImage();

		this.killMobile(motionElement,lorannWorld);
	}

	/**
	 * Gets the vecteur spell.
	 *
	 * @return the vecteur spell
	 */
	public IVectorDirection getVecteurSpell() {
		return this.VecteurSpell;
	}
	
	/**
	 * Kill mobile.
	 *
	 * @param motionElement the motion element
	 * @param lorannWorld the lorann world
	 * @return true, if successful
	 */
	private boolean killMobile(final IMotionElement motionElement,final ILorannWorld lorannWorld)
	{
		if(lorannWorld.removeMobile(motionElement.getX(), motionElement.getY()))
		{
			motionElement.setX(lorannWorld.getLorann().getX());
			motionElement.setY(lorannWorld.getLorann().getY());
			lorannWorld.addScore(100);
			return true;
		}
		return false;
	}
}