package model.lorannWorld.element.motion;

import contract.ControllerOrder;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.ISprite;
import contract.IVecteurDirection;
import model.lorannWorld.element.FactoryElement;
import model.lorannWorld.element.Permeability;

public class Lorann extends MotionElement implements ILorann{
	private IVecteurDirection vecteurOrder;
	
	//private IMobile Spell;

	private int XSpell = 0;
	private int YSpell = 0;

	

	

	public Lorann(final ISprite sprite, final Permeability permeability, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, permeability, symbole, lorannWorld);
	}

	public void animate() {
		this.savePosition();
		if(this.vecteurOrder.getNumberOfSpell() == 1){
		
			this.XSpell = this.vecteurOrder.getVecteurX()  ;
			this.YSpell = this.vecteurOrder.getVecteurY()  ;
			this.getLorannWorld().addElement(FactoryElement.getFromFileSymbolMotion('S',this.getLorannWorld()), -this.XSpell+this.getX(),-this.YSpell+this.getY());
		//	this.vecteurOrder.setNumberOfSpell(0);
			System.out.println("eeeee");
		}

		this.setX(this.getX()+this.vecteurOrder.getVecteurX());
		this.setY(this.getY()+this.vecteurOrder.getVecteurY());

		this.getSprite().changecurentImage(this.vecteurOrder.changeVecteurToImageNumber(this.vecteurOrder, this.getSprite().getCurrentStep()));
		this.executeMoveIfPossible(this.getX(), this.getY());

		for(final IMobile i : this.getLorannWorld().getMotionElements()){
			if((i.getX() == this.getX()) && (i.getY() == this.getY())){
				i.getStrategy().actionOnHit(i, this.getLorannWorld());
			}
		}
		this.getLorannWorld().removeMobile(this.getX(), this.getY());
	}

	public IVecteurDirection getVecteurOrder() {
		return this.vecteurOrder;
	}

	/*private void pickUp(){
		if((this.keyCode == ControllerOrder.UP )){

		}
		else  if (this.keyCode == ControllerOrder.DOWN)
		{

		}
		else if (this.keyCode == ControllerOrder.RIGHT)
		{

		}
		else if (this.keyCode == ControllerOrder.LEFT)
		{

		}

		else if((this.keyCode == ControllerOrder.RIGHTUP)){

		}
		else  if (this.keyCode == ControllerOrder.RIGHTDOWN)
		{

		}
		else if (this.keyCode == ControllerOrder.LEFTUP)
		{

		}
		else if (this.keyCode == ControllerOrder.LEFTDOWN)
		{

		}
		else {

		}
	}*/

	public void setKeyCode(final ControllerOrder keyCode){
		//this.keyCode = keyCode;
	}

	public void setVecteurOrder(final IVecteurDirection vecteurOrder) {
		this.vecteurOrder = vecteurOrder;
	}
	
	public int getXSpell() {
		return XSpell;
	}
	public int getYSpell() {
		return YSpell;
	}

	public void setXSpell(int xSpell) {
		XSpell = xSpell;
	}

	public void setYSpell(int ySpell) {
		YSpell = ySpell;
	}

}
