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

	public MotionElement(final ISprite sprite, final Permeability permeability, final char symbole, final int x, final int y) throws Exception
	{
		super(sprite, permeability, symbole);
		if(x<0 || x>20) {
			throw new Exception("X must be between 0 and 20");
		}
		this.x = x;
		if(y<0 || y>12) {
			throw new Exception("Y must be between 0 and 12");
		}
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
