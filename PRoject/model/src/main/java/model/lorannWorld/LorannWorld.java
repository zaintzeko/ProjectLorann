package model.lorannWorld;

import java.util.ArrayList;
import java.util.Observable;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionlessElement;

// TODO: Auto-generated Javadoc
/**
 * The Class LorannWorld.
 */
public class LorannWorld extends Observable implements ILorannWorld {
	
	/** The width. */
	private final int width;
	
	/** The height. */
	private final int height;
	
	/** The elements. */
	private final IMotionlessElement elements[][];
	
	/** The motion elements. */
	private final ArrayList<IMobile> motionElements;
	
	/** The lorann. */
	private ILorann lorann;
	
	/** The score. */
	private int score;
	
	/** The win. */
	private int win;

	/**
	 * Instantiates a new lorann world.
	 *
	 * @throws Exception the exception
	 */
	public LorannWorld() throws Exception {
		this(20, 12);
	}

	/**
	 * Instantiates a new lorann world.
	 *
	 * @param width the width
	 * @param height the height
	 * @throws Exception the exception
	 */
	public LorannWorld(final int width, final int height) throws Exception {
		this.elements = new IMotionlessElement[width][height];
		this.motionElements = new ArrayList<IMobile>();
		if(width != 20) { throw new Exception("Width must be 20");}
		this.width = width;
		if(height != 12) { throw new Exception("Height must be 20");}
		this.height = height;
		this.win = 0;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#addElement(contract.ILorann, int, int)
	 */
	public void addElement(final ILorann lorann, final int x, final int y) {
		this.setLorann(lorann);
		lorann.setX(x);
		lorann.setY(y);
		lorann.setSpell();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#addElement(contract.IMobile, int, int)
	 */
	public void addElement(final IMobile motionElement, final int x, final int y) {
		motionElement.setX(x);
		motionElement.setY(y);
		this.motionElements.add(motionElement);
		this.setChanged();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#addElement(contract.IMotionlessElement, int, int)
	 */
	public void addElement(final IMotionlessElement motionlessElement, final int x, final int y) {
		this.elements[x][y] = motionlessElement;
		this.setChanged();
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#addScore(int)
	 */
	public void addScore(final int score) {
		this.score += score;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getElement(int, int)
	 */
	public IMotionlessElement getElement( final int x, final int y) {
		return this.elements[x][y];
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getElements()
	 */
	public IMotionlessElement[][] getElements() {
		return this.elements;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getHeight()
	 */
	public int getHeight() {
		return this.height;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getLorann()
	 */
	public ILorann getLorann() {
		return this.lorann;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getMobileX(int)
	 */
	public IMobile getMobileX(final int x) {
		return this.motionElements.get(x);
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getMotionElements()
	 */
	public ArrayList<IMobile> getMotionElements() {
		return this.motionElements;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
	
	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getScore()
	 */
	public int getScore() {
		return this.score;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#getWidth()
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Loose.
	 */
	private void loose()
	{
		System.out.println("You loose");
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#play()
	 */
	public void play()
	{
		for(;this.win == 0;)
		{
			this.setChanged();
			this.notifyObservers();
			try {
				Thread.sleep(125);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
			for(final IMobile mobile : this.motionElements)	{
				mobile.getStrategy().animate(mobile, this);
			}
			this.lorann.animate();
		}
		if(this.win == 1) {
			this.win();
		}
		if(this.win == 2) {
			this.loose();
		}
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#removeMobile(int, int)
	 */
	public boolean removeMobile(final int x, final int y) {
		int i = 0;
		int elementIndex = -1;
		for(final IMobile mobile : this.getMotionElements()){
			if((mobile.getX() == x) && (mobile.getY() == y)){
				elementIndex = i;
			}
			i++;
		}
		if(elementIndex != -1){
			this.motionElements.remove(elementIndex);
			return true;
		}
		return false;
	}

	/**
	 * Sets the lorann.
	 *
	 * @param lorann the new lorann
	 */
	public void setLorann(final ILorann lorann) {
		this.lorann = lorann;
	}

	/* (non-Javadoc)
	 * @see contract.ILorannWorld#setWin(int)
	 */
	public void setWin(final int win) {
		this.win = win;
	}

	/**
	 * Win.
	 */
	private void win() {
		System.out.println("You win");
	}
}
