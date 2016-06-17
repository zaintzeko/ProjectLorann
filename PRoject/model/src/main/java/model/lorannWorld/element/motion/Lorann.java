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

	public void setKeyCode(int keyCode){
		this.keyCode = keyCode;
	}

	public void animate() {
		if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_LEFT){
			
		}
	}

}
