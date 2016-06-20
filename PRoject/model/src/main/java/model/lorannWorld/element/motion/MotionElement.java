package model.lorannWorld.element.motion;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.ISprite;
import model.lorannWorld.element.Element;

// TODO: Auto-generated Javadoc
/**
 * The Class MotionElement.
 */
public abstract class MotionElement extends Element implements IMotionElement{
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	/** The save X. */
	private int saveX;
	
	/** The save Y. */
	private int saveY;
	
	/** The lorann world. */
	private ILorannWorld lorannWorld;

	/**
	 * Instantiates a new motion element.
	 *
	 * @param sprite the sprite
	 * @param symbole the symbole
	 * @param lorannWorld the lorann world
	 */
	public MotionElement(final ISprite sprite, final char symbole, final ILorannWorld lorannWorld) {
		super(sprite, symbole);
		this.lorannWorld = lorannWorld;
	}

	/**
	 * Instantiates a new motion element.
	 *
	 * @param sprite the sprite
	 * @param symbole the symbole
	 * @param x the x
	 * @param y the y
	 * @param lorannWorld the lorann world
	 * @throws Exception the exception
	 */
	public MotionElement(final ISprite sprite, final char symbole, final int x, final int y, final ILorannWorld lorannWorld) throws Exception  {
		super(sprite, symbole);
		if((x<0) || (x>20)) {
			throw new Exception("X must be between 0 and 20");
		}
		this.x = x;
		if((y<0) || (y>12)) {
			throw new Exception("Y must be between 0 and 12");
		}
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#executeMoveIfPossible(int, int)
	 */
	public Boolean executeMoveIfPossible( final int x, final int y) {
		if (this.lorannWorld.getElement(x, y)==null) {
			return true;
		}
		else {
			this.x=this.saveX;
			this.y=this.saveY;
			return false;
		}
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#getLorannWorld()
	 */
	public ILorannWorld getLorannWorld(){
		return this.lorannWorld;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#getSaveX()
	 */
	public int getSaveX() {
		// TODO Auto-generated method stub
		return this.saveX;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#getSaveY()
	 */
	public int getSaveY() {
		return this.saveY;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#getX()
	 */
	public int getX() {
		return this.x;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#getY()
	 */
	public int getY() {
		return this.y;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#killElement(contract.IMotionElement)
	 */
	public void killElement(final IMotionElement deathMotionElement) {
		for(final IMotionElement motionElements : this.getLorannWorld().getMotionElements())
		{
			if(motionElements == deathMotionElement)
			{
				this.getLorannWorld();
				this.getLorannWorld().getLorann().getVectorOrder().setNumberOfSpell(0);
			}

		}
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#savePosition()
	 */
	public void savePosition() {
		this.saveX =this.x;
		this.saveY = this.y;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#setSaveX(int)
	 */
	public void setSaveX(final int saveX) {
		this.saveX = saveX;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#setSaveY(int)
	 */
	public void setSaveY(final int saveY) {
		this.saveY = saveY;
	}

	/* (non-Javadoc)
	 * @see contract.IMotionElement#setX(int)
	 */
	public void setX(final int x) {
		this.x = x;
	}
	
	/* (non-Javadoc)
	 * @see contract.IMotionElement#setY(int)
	 */
	public void setY(final int y) {
		this.y = y;
	}
}