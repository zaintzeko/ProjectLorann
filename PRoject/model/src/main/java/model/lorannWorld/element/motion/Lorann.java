package model.lorannWorld.element.motion;

import java.awt.event.KeyEvent;

import contract.ISprite;
import model.lorannWorld.element.Permeability;

public class Lorann extends MotionElement{
	int keyCode;
	public Lorann(final ISprite sprite, final Permeability permeability, final char symbole, int keyCode) {
		super(sprite, permeability, symbole);
		this.keyCode = keyCode;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(int keyCode) {
		if(keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN || keyCode == KeyEvent.VK_RIGHT || keyCode == KeyEvent.VK_LEFT){
			
		}
	}
}
