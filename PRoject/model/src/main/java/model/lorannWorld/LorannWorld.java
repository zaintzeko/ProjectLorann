package model.lorannWorld;

import java.util.ArrayList;
import java.util.Observable;

import contract.IElement;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IMotionlessElement;

public class LorannWorld extends Observable implements ILorannWorld {
	private final int width;
	private final int height;
	private final IElement elements[][];
	public ArrayList<IMotionElement> motionElements;

	public LorannWorld() throws Exception {
		this(20, 12);

	}

	public LorannWorld(final int width, final int height) throws Exception {
		this.elements = new IElement[width][height];
		this.motionElements = new ArrayList<IMotionElement>();
		if(width != 20) { throw new Exception("Width must be 20");}
		this.width = width;
		if(height != 12) { throw new Exception("Height must be 20");}
		this.height = height;


	}

	public void addElement(final IMotionElement motionELement, final int x, final int y) {
		motionELement.setX(x);
		motionELement.setY(y);
		this.motionElements.add(motionELement);
		this.setChanged();

	}
	public void addElement(final IMotionlessElement motionlessElement, final int x, final int y) {

		//System.out.println(motionlessElement.getSymbole());
		this.elements[x][y] = motionlessElement;
		this.setChanged();
	}

	/* (non-Javadoc)
	 * @see model.ILorannWorld#addElement(model.Element, int, int)
	 */
	/*public void addMotionlessElement(final IMotionlessElement motionlessElement, final int x, final int y){
		this.elements[x][y] = motionlessElement;
		//if (motionlessElement != null) {motionlessElement.setLorannWorld(this);}
	}*/
	/* (non-Javadoc)
	 * @see model.ILorannWorld#getElement(int, int)
	 */
	public IElement getElement( final int x, final int y){
		return this.elements[x][y];

	}
	/* (non-Javadoc)
	 * @see model.ILorannWorld#getHeight()
	 */
	public int getHeight() {
		return this.height;
	}

	public ArrayList<IMotionElement> getMotionElements() {

		return this.motionElements;
	}

	public IElement[][] getMotionlessElements() {
		return this.elements;
	}

	public Observable getObservable() {
		return this;
	}

	/* (non-Javadoc)
	 * @see model.ILorannWorld#getWidth()
	 */
	public int getWidth() {
		return this.width;
	}

	public void play()
	{
		try {
			Thread.sleep(1000);
		} catch (final InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.elements[0][3] = null;
		this.setChanged();
		this.notifyObservers();
		for(;;)
		{
			//
			//
		}
	}

}
