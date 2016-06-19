package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionElement;
import contract.IStrategy;
import contract.IVecteurDirection;

public class BehaviorSpell implements IStrategy{
	private IVecteurDirection VecteurSpell;


	private int x;
	private int y;
	public void actionOnHit(final IMotionElement motionElement, final ILorannWorld lorannWorld) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {
		
	//this.VecteurSpell.setVecteurX(-lorannWorld.getLorann().getVecteurOrder().getVecteurX());
	//this.VecteurSpell.setVecteurY(-lorannWorld.getLorann().getVecteurOrder().getVecteurY());
		motionElement.savePosition();
		if(motionElement.executeMoveIfPossible(motionElement.getX()+ -lorannWorld.getLorann().getXSpell(), motionElement.getY() + -lorannWorld.getLorann().getYSpell())){
	motionElement.setX(motionElement.getX()+ -lorannWorld.getLorann().getXSpell());
	motionElement.setY(motionElement.getY() + -lorannWorld.getLorann().getYSpell());
		}
		else {
			motionElement.setX(motionElement.getX()+ lorannWorld.getLorann().getXSpell());
			motionElement.setY(motionElement.getY() + lorannWorld.getLorann().getYSpell());
			lorannWorld.getLorann().setXSpell(-lorannWorld.getLorann().getXSpell());
			lorannWorld.getLorann().setYSpell(-lorannWorld.getLorann().getYSpell());
		}
}
	public IVecteurDirection getVecteurSpell() {
		return this.VecteurSpell;
	}
}