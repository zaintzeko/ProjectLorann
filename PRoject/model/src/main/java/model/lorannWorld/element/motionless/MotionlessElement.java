package model.lorannWorld.element.motionless;

import model.lorannWorld.element.ISprite;
import model.lorannWorld.element.Permeability;

public class MotionlessElement {
	private Permeability permeability;
	private ISprite sprite;
	private char symbole;
	
	public MotionlessElement(ISprite sprite, Permeability permeability, char symbole ){
		this.permeability = permeability;
		this.sprite = sprite; 
		this.symbole = symbole;
	}
	public ISprite getSprite() {
		return sprite;
	}
	public void setSprite(ISprite sprite) {
		this.sprite = sprite;
	}
	public char getSymbole() {
		return symbole;
	}
	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}
	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

}
