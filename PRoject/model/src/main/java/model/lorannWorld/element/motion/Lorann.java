package model.lorannWorld.element.motion;

import java.awt.event.KeyEvent;

import contract.ILorann;
import contract.ILorannWorld;
import contract.ISprite;
import model.lorannWorld.element.Permeability;

public class Lorann extends MotionElement implements ILorann{
	private int keyCode;
	public Lorann(final ISprite sprite, final Permeability permeability, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, permeability, symbole, lorannWorld);

	}

	public void animate() {
		if((this.keyCode == KeyEvent.VK_UP)){
			this.moveUp();
			this.getSprite().changecurentImage(0);
		}
		else  if (this.keyCode == KeyEvent.VK_DOWN)
		{
			this.moveDown();
			this.getSprite().changecurentImage(4);
		}
		else if (this.keyCode == KeyEvent.VK_RIGHT)
		{
			this.moveRight();
			this.getSprite().changecurentImage(2);
		}
		else if (this.keyCode == KeyEvent.VK_LEFT)
		{
			this.moveLeft();
			this.getSprite().changecurentImage(6);
		}
		else {
			this.getSprite().changeToNextImage();
		}
		this.keyCode = 0;
	}

	public void setKeyCode(final int keyCode){
		this.keyCode = keyCode;
	}

}
