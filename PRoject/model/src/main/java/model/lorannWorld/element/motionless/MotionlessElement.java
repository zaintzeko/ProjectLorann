package model.lorannWorld.element.motionless;

import model.lorannWorld.element.ISprite;
import model.lorannWorld.element.Permeability;

public class MotionlessElement {
	private Permeability permeability;
	private ISprite sprite;
	
	public MotionlessElement(ISprite sprite, Permeability permeability ){
		this.permeability = permeability;
		this.sprite = sprite; 
		
	}
	public Permeability getPermeability() {
		return permeability;
	}

	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

}
