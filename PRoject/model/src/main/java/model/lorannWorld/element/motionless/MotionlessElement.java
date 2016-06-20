package model.lorannWorld.element.motionless;

import contract.IMotionlessElement;
import contract.ISprite;
import model.lorannWorld.element.Element;

public class MotionlessElement extends Element implements IMotionlessElement{

	public MotionlessElement(final ISprite sprite, final char symbole ){
		super(sprite, symbole);
	}
}
