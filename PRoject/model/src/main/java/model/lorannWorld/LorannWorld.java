package model.lorannWorld;

import java.util.ArrayList;
import java.util.Observable;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionlessElement;

public class LorannWorld extends Observable implements ILorannWorld {
	private final int width;
	private final int height;
	private final IMotionlessElement elements[][];
	private final ArrayList<IMobile> motionElements;
	private ILorann lorann;
	private int score;
	private int win;

	public LorannWorld() throws Exception {
		this(20, 12);
	}

	public LorannWorld(final int width, final int height) throws Exception {
		this.elements = new IMotionlessElement[width][height];
		this.motionElements = new ArrayList<IMobile>();
		if(width != 20) { throw new Exception("Width must be 20");}
		this.width = width;
		if(height != 12) { throw new Exception("Height must be 20");}
		this.height = height;
		this.win = 0;
	}

	public void addElement(final ILorann lorann, final int x, final int y) {
		this.setLorann(lorann);
		lorann.setX(x);
		lorann.setY(y);
		lorann.setSpell();
	}

	public void addElement(final IMobile motionElement, final int x, final int y) {
		motionElement.setX(x);
		motionElement.setY(y);
		this.motionElements.add(motionElement);
		this.setChanged();
	}

	public void addElement(final IMotionlessElement motionlessElement, final int x, final int y) {
		this.elements[x][y] = motionlessElement;
		this.setChanged();
	}

	public void addScore(final int score) {
		this.score += score;
	}

	public IMotionlessElement getElement( final int x, final int y) {
		return this.elements[x][y];
	}
	public IMotionlessElement[][] getElements() {
		return this.elements;
	}

	public int getHeight() {
		return this.height;
	}

	public ILorann getLorann() {
		return this.lorann;
	}

	public IMobile getMobileX(final int x) {
		return this.motionElements.get(x);
	}

	public ArrayList<IMobile> getMotionElements() {
		return this.motionElements;
	}

	public Observable getObservable() {
		return this;
	}
	public int getScore() {
		return this.score;
	}

	public int getWidth() {
		return this.width;
	}

	private void loose()
	{
		System.out.println("You loose");
	}

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

	public void setLorann(final ILorann lorann) {
		this.lorann = lorann;
	}

	public void setWin(final int win) {
		this.win = win;
	}

	private void win() {
		System.out.println("You win");
	}
}
