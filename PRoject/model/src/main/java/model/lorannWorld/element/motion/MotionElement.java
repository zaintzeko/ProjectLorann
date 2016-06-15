package model.lorannWorld.element.motion;

import java.awt.Image;

import contract.IMotionElement;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.ISprite;

public abstract class MotionElement extends Element implements IMotionElement{
	private int x;
	public ISprite getSprite() {
		return sprite;
	}

	public ISprite setSprite(ISprite sprite) {
		return this.sprite = sprite;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int y;
	private ISprite sprite;
	private Direction direction;
	
	public MotionElement(ISprite sprite)
	{
		this.sprite = sprite;
	}
	
	public MotionElement(ISprite sprite, int x, int y)
	{
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
