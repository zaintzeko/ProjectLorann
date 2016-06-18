package model.lorannWorld.element.motion;

import contract.ControllerOrder;
import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.ISprite;
import model.lorannWorld.element.Permeability;

public class Lorann extends MotionElement implements ILorann{
	private ControllerOrder keyCode;
	public Lorann(final ISprite sprite, final Permeability permeability, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, permeability, symbole, lorannWorld);
	}
	public void animate() {

		if((this.keyCode == ControllerOrder.UP)){
			this.moveUp();
			this.getSprite().changecurentImage(0);
		}
		else  if (this.keyCode == ControllerOrder.DOWN)
		{
			this.moveDown();
			this.getSprite().changecurentImage(4);
		}
		else if (this.keyCode == ControllerOrder.RIGHT)
		{
			this.moveRight();
			this.getSprite().changecurentImage(2);
		}
		else if (this.keyCode == ControllerOrder.LEFT)
		{
			this.moveLeft();
			this.getSprite().changecurentImage(6);
		}

		else if((this.keyCode == ControllerOrder.RIGHTUP)){
			this.moveRightUp();
			this.getSprite().changecurentImage(1);
		}
		else  if (this.keyCode == ControllerOrder.RIGHTDOWN)
		{
			this.moveRightDown();
			this.getSprite().changecurentImage(3);
		}
		else if (this.keyCode == ControllerOrder.LEFTUP)
		{
			this.moveLeftUp();
			this.getSprite().changecurentImage(7);
		}
		else if (this.keyCode == ControllerOrder.LEFTDOWN)
		{
			this.moveLeftDown();
			this.getSprite().changecurentImage(5);
		}
		else {
			this.getSprite().changeToNextImage();
		}
		//System.out.println(this.getLorannWorld());
		for(final IMobile i : this.getLorannWorld().getMotionElements()){
			if((i.getX() == this.getX()) && (i.getY() == this.getY())){
				i.getStrategy().actionOnHit(this, this.getLorannWorld());
			}
		}
		this.getLorannWorld().removeMobile(this.getX(), this.getY());
	}

	private void pickUp(){
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
	}

	public void setKeyCode(final ControllerOrder keyCode){
		this.keyCode = keyCode;
	}

}
