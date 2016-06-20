package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMobile;
import contract.ISprite;
import contract.IStrategy;

// TODO: Auto-generated Javadoc
/**
 * The Class Mobile.
 */
public class Mobile extends MotionElement implements IMobile{
	
	/** The strategy. */
	private final IStrategy strategy;
	
	/**
	 * Instantiates a new mobile.
	 *
	 * @param sprite the sprite
	 * @param symbole the symbole
	 * @param strategy the strategy
	 * @param lorannWorld the lorann world
	 */
	public Mobile(final ISprite sprite, final char symbole, final IStrategy strategy, final ILorannWorld lorannWorld)
	{
		super(sprite, symbole, lorannWorld);
		this.strategy = strategy;
	}

	/**
	 * Instantiates a new mobile.
	 *
	 * @param sprite the sprite
	 * @param symbole the symbole
	 * @param strategy the strategy
	 * @param x the x
	 * @param y the y
	 * @param lorannWorld the lorann world
	 * @throws Exception the exception
	 */
	public Mobile(final ISprite sprite, final char symbole, final IStrategy strategy, final int x, final int y, final ILorannWorld lorannWorld) throws Exception
	{
		super(sprite, symbole, x, y, lorannWorld);
		this.strategy = strategy;
	}

	/* (non-Javadoc)
	 * @see model.lorannWorld.element.motion.MotionElement#executeMoveIfPossible(int, int)
	 */
	@Override
	public Boolean executeMoveIfPossible(final int x, final int y){
		boolean a = false;
		if (this.getLorannWorld().getElement(x, y)==null)
		{
			a = true;
		} else {
			a = false;
		}

		for(final IMobile I : this.getLorannWorld().getMotionElements())
		{
			if((I.getX() == x) && (I.getY() == y) && (I != this))
			{
				a = false;
			}
		}
		if(a) {
			return a;
		}
		this.setX(this.getSaveX());
		this.setY(this.getSaveY());
		return a;
	}

	/* (non-Javadoc)
	 * @see model.lorannWorld.element.motion.IMotion#getStrategy()
	 */
	public IStrategy getStrategy() {
		return this.strategy;
	}

}
