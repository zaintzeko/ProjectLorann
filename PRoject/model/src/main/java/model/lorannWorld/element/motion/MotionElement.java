package model.lorannWorld.element.motion;

import java.awt.Image;

import contract.IMotionElement;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.ISprite;
import model.lorannWorld.element.Permeability;

public abstract class MotionElement extends Element implements IMotionElement{
	private int x;
	private int y;

	public MotionElement( ISprite sprite, Permeability permeability)
	{
		super(sprite, permeability);
	}
	
	public MotionElement(ISprite sprite,Permeability permeability, int x, int y)
	{
		super(sprite, permeability);
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
