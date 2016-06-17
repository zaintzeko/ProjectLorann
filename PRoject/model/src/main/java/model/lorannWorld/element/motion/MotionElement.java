package model.lorannWorld.element.motion;

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

	public MotionElement(final ISprite sprite, final Permeability permeability, final char symbole, final int x, final int y) throws Exception
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

	private Boolean executeMoveIfPossible( final int x, final int y){
		if (this.lorannWorld.getElement(x, y)==null)
		{
			//this.lorannWorld.getObservable().setChanged();
			//this.lorannWorld.getObservable().notifyObservers();;
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

	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	public boolean moveDown(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y++;
		return this.executeMoveIfPossible(this.x, this.y);
	}

	public Boolean moveLeft(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.x--;
		return this.executeMoveIfPossible(this.x, this.y);
	}

	public boolean moveLeftDown(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y++;
		this.x--;
		return this.executeMoveIfPossible(this.x, this.y);
	}
	public boolean moveLeftUp(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y--;
		this.x--;
		return this.executeMoveIfPossible(this.x, this.y);
	}

	public boolean moveRight(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.x++;
		return this.executeMoveIfPossible(this.x, this.y);
	}

	public boolean moveRightDown(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y++;
		this.x++;
		return this.executeMoveIfPossible(this.x, this.y);
	}

	public boolean moveRightUp(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y--;
		this.x++;
		return this.executeMoveIfPossible(this.x, this.y);
	}

	public boolean moveUp(){
		this.saveX = this.x;
		this.saveY =this.y;
		this.y--;
		return this.executeMoveIfPossible(this.x, this.y);
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
