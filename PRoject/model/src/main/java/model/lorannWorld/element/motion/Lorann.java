package model.lorannWorld.element.motion;

import contract.ILorann;
import contract.ILorannWorld;
import contract.ISprite;
import model.lorannWorld.element.Permeability;

public class Lorann extends MotionElement implements ILorann{
	public Lorann(final ISprite sprite, final Permeability permeability, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, permeability, symbole, lorannWorld);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	/* (non-Javadoc)
	 * @see model.lorannWorld.element.motion.ILorann#animate()
	 */
	public void animate() {

	}
}
