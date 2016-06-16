package model.lorannWorld.element.motionless;

import contract.IMotionlessElement;
import contract.ISprite;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.Permeability;

public class MotionlessElement extends Element implements IMotionlessElement{

	public MotionlessElement(final ISprite sprite, final Permeability permeability, final char symbole ){
		super(sprite, permeability, symbole);
	}
}
