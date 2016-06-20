package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMobile;
import contract.ISpell;
import contract.ISprite;
import contract.IStrategy;

public class Spell extends Mobile implements ISpell{
	public Spell(final ISprite sprite, final char symbole, final IStrategy strategy,
			final ILorannWorld lorannWorld) {
		super(sprite, symbole, strategy, lorannWorld);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.lorannWorld.element.motion.ISpell#executeMoveIfPossible(int, int)
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
			if((I.getX() == x) && (I.getY() == y) && (I != this) && ((I.getSymbole() == 't') || (I.getSymbole() == 'k') || (I.getSymbole() == 'd')))
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
