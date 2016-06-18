package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMobile;
import contract.ISprite;
import contract.IStrategy;
import model.lorannWorld.element.Permeability;

public class Mobile extends MotionElement implements IMobile{
	private final IStrategy strategy;
	public Mobile(final ISprite sprite, final Permeability permeability, final char symbole, final IStrategy strategy, final ILorannWorld lorannWorld)
	{
		super(sprite, permeability, symbole, lorannWorld);
		this.strategy = strategy;
	}

	public Mobile(final ISprite sprite, final Permeability permeability, final char symbole, final IStrategy strategy, final int x, final int y, final ILorannWorld lorannWorld) throws Exception
	{
		super(sprite, permeability, symbole, x, y, lorannWorld);
		this.strategy = strategy;
	}
	/* (non-Javadoc)
	 * @see model.lorannWorld.element.motion.IMotion#getStrategy()
	 */
	public IStrategy getStrategy() {
		return this.strategy;
	}

}
