package model.lorannWorld.element.motion;

import contract.Direction;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.ISprite;
import model.lorannWorld.element.Element;
import model.lorannWorld.element.Permeability;

public abstract class MotionElement extends Element implements IMotionElement{
	private int x;
	private int y;
	private Direction direction;
	private int saveX;
	private int saveY;
	private ILorannWorld lorannWorld;

	public MotionElement(final ISprite sprite, final Permeability permeability, final char symbole, final ILorannWorld lorannWorld)
	{
		super(sprite, permeability, symbole);
		this.direction = Direction.NONE;
		this.lorannWorld = lorannWorld;
	}

	public MotionElement(final ISprite sprite, final Permeability permeability, final char symbole, final int x, final int y, final ILorannWorld lorannWorld) throws Exception
	{
		super(sprite, permeability, symbole);
		if((x<0) || (x>20)) {
			throw new Exception("X must be between 0 and 20");
		}
		this.x = x;
		if((y<0) || (y>12)) {
			throw new Exception("Y must be between 0 and 12");
		}
		this.y = y;
	}

	public Boolean executeMoveIfPossible( final int x, final int y){
		if (this.lorannWorld.getElement(x, y)==null)
		{
			return true;
		}
		else
		{
			this.x=this.saveX;
			this.y=this.saveY;
			return false;
		}
	}
	public Direction getDirection() {
		return this.direction;
	}

	public ILorannWorld getLorannWorld(){
		return this.lorannWorld;
	}

	public int getSaveX() {
		// TODO Auto-generated method stub
		return this.saveX;
	}

	public int getSaveY() {
		return this.saveY;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void killElement(final IMotionElement deathMotionElement)
	{
		for(final IMotionElement motionElements : this.getLorannWorld().getMotionElements())
		{
			if(motionElements == deathMotionElement)
			{
				this.getLorannWorld();
			}
		}
	}

	public void savePosition()
	{
		this.saveX =this.x;
		this.saveY = this.y;
	}

	public void setDirection(final Direction direction) {
		this.direction = direction;
	}

	public void setSaveX(final int saveX) {
		this.saveX = saveX;
	}

	public void setSaveY(final int saveY) {
		this.saveY = saveY;
	}

	public void setX(final int x) {
		this.x = x;
	}
	public void setY(final int y) {
		this.y = y;
	}
}
