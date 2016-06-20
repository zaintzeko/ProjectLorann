package model.lorannWorld.element.motionless;

import contract.IMotionlessElement;
import contract.ISprite;
import model.lorannWorld.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionlessElement.
 */
public class MotionlessElement extends Element implements IMotionlessElement{

	/**
	 * Instantiates a new motionless element.
	 *
	 * @param sprite the sprite
	 * @param symbole the symbole
	 */
	public MotionlessElement(final ISprite sprite, final char symbole ){
		super(sprite, symbole);
	}
}
