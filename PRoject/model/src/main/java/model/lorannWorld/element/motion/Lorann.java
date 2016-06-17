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
		if((this.keyCode == KeyEvent.VK_UP) || (this.keyCode == KeyEvent.VK_DOWN) || (this.keyCode == KeyEvent.VK_RIGHT) || (this.keyCode == KeyEvent.VK_LEFT)){

		}
	}

	public void setKeyCode(final int keyCode){
		this.keyCode = keyCode;
	}

}
