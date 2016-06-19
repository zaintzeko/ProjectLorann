package model.lorannWorld.element.motion;

import contract.ControllerOrder;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.ISprite;
import contract.IVecteurDirection;
import model.lorannWorld.element.Permeability;

public class Lorann extends MotionElement implements ILorann{
	private IVecteurDirection vecteurOrder;
	public Lorann(final ISprite sprite, final Permeability permeability, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, permeability, symbole, lorannWorld);
	}

	public void animate() {
		this.savePosition();

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

}
