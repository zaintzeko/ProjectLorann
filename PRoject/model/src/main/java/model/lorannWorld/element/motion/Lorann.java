package model.lorannWorld.element.motion;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.ISprite;
import contract.IVecteurDirection;
import model.lorannWorld.element.FactoryElement;

public class Lorann extends MotionElement implements ILorann{
	private IVecteurDirection vecteurOrder;

	//private IMobile Spell;

	private int XSpell = 0;
	private int YSpell = 0;
	private boolean theSpellFollowYou;

	private final IMobile spell;
	public Lorann(final ISprite sprite, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, symbole, lorannWorld);
		this.spell = FactoryElement.getFromFileSymbolMotion('S',this.getLorannWorld());
		this.theSpellFollowYou = true;
	}

	public void animate() {
		this.testIfTouchAnElement();

		this.savePosition();

		this.theSpellFollowYou = (this.getX() == this.spell.getX())&& (this.getY() == this.spell.getY());

		this.setVecteurSpell();

		this.setX(this.getX()+this.vecteurOrder.getVecteurX());
		this.setY(this.getY()+this.vecteurOrder.getVecteurY());

		this.getSprite().changecurentImage(this.vecteurOrder.changeVecteurToImageNumber(this.vecteurOrder, this.getSprite().getCurrentStep()));
		this.executeMoveIfPossible(this.getX(), this.getY());

		this.testIfTouchAnElement();

		if(!this.theSpellFollowYou) {
			this.theSpellFollowYou = (this.getX() == this.spell.getX())&& (this.getY() == this.spell.getY());
		}

		this.spell.getStrategy().animate(this.spell, this.getLorannWorld());
		if(this.theSpellFollowYou){
			this.spell.setX(this.getX());
			this.spell.setY(this.getY());
		}
	}

	public IMobile getSpell(){
		return this.spell;
	}

	public IVecteurDirection getVecteurOrder() {
		return this.vecteurOrder;
	}
	public int getXSpell() {
		return this.XSpell;
	}

	public int getYSpell() {
		return this.YSpell;
	}

	public void setSpell() {
		this.spell.setX(this.getX());
		this.spell.setY(this.getY());
	}

	public void setVecteurOrder(final IVecteurDirection vecteurOrder) {
		this.vecteurOrder = vecteurOrder;
	}
	private void setVecteurSpell()
	{
		if(this.vecteurOrder.getNumberOfSpell() == 1) {
			if(this.theSpellFollowYou){

				this.XSpell = this.vecteurOrder.getVecteurX();
				this.YSpell = this.vecteurOrder.getVecteurY();
				this.theSpellFollowYou = false;

			}
			else {
				this.XSpell = -this.vecteurOrder.getVecteurX();
				this.YSpell = -this.vecteurOrder.getVecteurY();
			}
		}
	}

	public void setXSpell(final int xSpell) {
		this.XSpell = xSpell;
	}

	public void setYSpell(final int ySpell) {
		this.YSpell = ySpell;
	}

	private void testIfTouchAnElement()
	{
		for(final IMobile i : this.getLorannWorld().getMotionElements()){
			if((i.getX() == this.getX()) && (i.getY() == this.getY())){
				i.getStrategy().actionOnHit(i, this.getLorannWorld());
			}
		}
		this.getLorannWorld().removeMobile(this.getX(), this.getY());
	}


}
