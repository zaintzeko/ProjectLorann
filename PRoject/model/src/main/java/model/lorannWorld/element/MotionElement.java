package model.lorannWorld.element;

import java.awt.Image;

import contract.IMotionElement;

public abstract class MotionElement extends Element implements IMotionElement{
	private int x;
	private int y;
	private ISprite sprite;
	
	public MotionElement(ISprite sprite, Permeability permeability)
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
		return 0;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
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
