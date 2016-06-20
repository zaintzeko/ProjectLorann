package model.lorannWorld.element.motion;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.ISprite;
import contract.IVectorDirection;
import model.lorannWorld.element.FactoryElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Lorann.
 */
public class Lorann extends MotionElement implements ILorann{
	
	/** The vector order. */
	private IVectorDirection vectorOrder;

	//private IMobile Spell;

	/** The X spell. */
	private int XSpell = 0;
	
	/** The Y spell. */
	private int YSpell = 0;
	
	/** The spell follow you. */
	private boolean theSpellFollowYou;
	
	/** The dont move again. */
	private boolean dontMoveAgain = false;

	/** The spell. */
	private final IMobile spell;
	
	/**
	 * Instantiates a new lorann.
	 *
	 * @param sprite the sprite
	 * @param symbole the symbole
	 * @param lorannWorld the lorann world
	 */
	public Lorann(final ISprite sprite, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, symbole, lorannWorld);
		this.spell = FactoryElement.getFromFileSymbolMotion('S',this.getLorannWorld());
		this.theSpellFollowYou = true;
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#animate()
	 */
	public void animate() {
		dontMoveAgain = false;
		this.testIfTouchAnElement();

		this.savePosition();

		this.theSpellFollowYou = (this.getX() == this.spell.getX())&& (this.getY() == this.spell.getY());

		this.setVectorSpell();

		this.setX(this.getX()+this.vectorOrder.getVectorX());
		this.setY(this.getY()+this.vectorOrder.getVectorY());

		this.getSprite().changecurentImage(this.vectorOrder.changeVectorToImageNumber(this.vectorOrder, this.getSprite().getCurrentStep()));
		this.executeMoveIfPossible(this.getX(), this.getY());

		this.testIfTouchAnElement();

		if(!this.theSpellFollowYou) {
			this.theSpellFollowYou = (this.getX() == this.spell.getX())&& (this.getY() == this.spell.getY());
		}

		if(!this.dontMoveAgain)this.spell.getStrategy().animate(this.spell, this.getLorannWorld());
		if(this.theSpellFollowYou){
			this.spell.setX(this.getX());
			this.spell.setY(this.getY());
		}
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#getSpell()
	 */
	public IMobile getSpell(){
		return this.spell;
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#getVectorOrder()
	 */
	public IVectorDirection getVectorOrder() {
		return this.vectorOrder;
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorann#getXSpell()
	 */
	public int getXSpell() {
		return this.XSpell;
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#getYSpell()
	 */
	public int getYSpell() {
		return this.YSpell;
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#setSpell()
	 */
	public void setSpell() {
		this.spell.setX(this.getX());
		this.spell.setY(this.getY());
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#setVectorOrder(contract.IVectorDirection)
	 */
	public void setVectorOrder(final IVectorDirection vecteurOrder) {
		this.vectorOrder = vecteurOrder;
	}
	
	/**
	 * Sets the vector spell.
	 */
	private void setVectorSpell()
	{
		if(this.vectorOrder.getNumberOfSpell() == 1) {
			if(this.theSpellFollowYou){
				this.spell.savePosition();
				this.XSpell = this.vectorOrder.getVectorX();
				this.YSpell = this.vectorOrder.getVectorY();
				this.spell.executeMoveIfPossible(this.spell.getX()-this.XSpell, this.spell.getY()-this.YSpell);
				this.theSpellFollowYou = false;
				this.dontMoveAgain = true;
			}
			else {
				this.XSpell = this.vectorByPosition(this.spell.getX(), this.getX());
				this.YSpell = this.vectorByPosition(this.spell.getY(), this.getY());
				this.dontMoveAgain = false;
			}
		}
	}

	/* (non-Javadoc)
	 * @see contract.ILorann#setXSpell(int)
	 */
	public void setXSpell(final int xSpell) {
		this.XSpell = xSpell;
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorann#setYSpell(int)
	 */
	public void setYSpell(final int ySpell) {
		this.YSpell = ySpell;
	}

	/**
	 * Test if touch an element.
	 */
	private void testIfTouchAnElement()
	{
		for(final IMobile i : this.getLorannWorld().getMotionElements()){
			if((i.getX() == this.getX()) && (i.getY() == this.getY())){
				i.getStrategy().actionOnHit(i, this.getLorannWorld());
			}
		}
		this.getLorannWorld().removeMobile(this.getX(), this.getY());
	}

	/**
	 * Vector by position.
	 *
	 * @param positionSpell the position spell
	 * @param positionLorann the position lorann
	 * @return the int
	 */
	private int vectorByPosition(final int positionSpell, final int positionLorann) {
		if(positionSpell > positionLorann) {
			return 1;
		}
		else if(positionSpell < positionLorann)	{
			return -1;
		} else {
			return 0;
		}
	}
}
