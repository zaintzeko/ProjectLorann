package model.lorannWorld.element.motionless;

import contract.ISprite;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.Permeability;

public class MotionlessElement extends Element{

	public MotionlessElement(final ISprite sprite, final Permeability permeability, final char symbole ){
		super(sprite, permeability, symbole);
	}

}
