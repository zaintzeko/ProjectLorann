package model.lorannWorld.element.motion;

import contract.IMotionElement;
import contract.ISprite;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.Permeability;

public abstract class MotionElement extends Element implements IMotionElement{
	private int x;
	private int y;
	private Direction direction;

	public MotionElement(final ISprite sprite, final Permeability permeability, final char symbole)
	{
		super(sprite, permeability, symbole);
		this.direction = Direction.NONE;
	}

	public MotionElement(final ISprite sprite, final Permeability permeability, final char symbole, final int x, final int y)
	{
		super(sprite, permeability, symbole);
		this.x = x;
		this.y = y;
	}

	public Direction getDirection() {
		return this.direction;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	public void setDirection(final Direction direction) {
		this.direction = direction;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public void setY(final int y) {
		this.y = y;
	}


}
