package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionElement;
import contract.ISprite;
import contract.IStrategy;
import model.lorannWorld.element.Permeability;

public class Mobile extends MotionElement implements IMobile{
	private final IStrategy strategy;
	private final ILorannWorld lorannWorld;
	public Mobile(final ISprite sprite, final Permeability permeability, final char symbole, final IStrategy strategy, final ILorannWorld lorannWorld)
	{
		super(sprite, permeability, symbole, lorannWorld);
		this.strategy = strategy;
		this.lorannWorld = lorannWorld;
	}

	public Mobile(final ISprite sprite, final Permeability permeability, final char symbole, final IStrategy strategy, final int x, final int y, final ILorannWorld lorannWorld) throws Exception
	{
		super(sprite, permeability, symbole, x, y, lorannWorld);
		this.strategy = strategy;
		this.lorannWorld = lorannWorld;
	}
	/* (non-Javadoc)
	 * @see model.lorannWorld.element.motion.IMotion#getStrategy()
	 */
	public IStrategy getStrategy() {
		return this.strategy;
	}
	 @Override
	public Boolean executeMoveIfPossible(final int x, final int y){
		  boolean a = false;
		  if (this.lorannWorld.getElement(x, y)==null)
		  {
		   a = true;
		  } else {
		   a = false;
		  }

		  for(final IMobile I : this.lorannWorld.getMotionElements())
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

}
