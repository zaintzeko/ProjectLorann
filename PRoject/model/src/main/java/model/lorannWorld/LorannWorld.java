package model.lorannWorld;

import java.util.ArrayList;
import java.util.Observable;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionElement;
import contract.IMotionlessElement;

public class LorannWorld extends Observable implements ILorannWorld {
	private final int width;
	private final int height;
	private final IMotionlessElement elements[][];
	private final ArrayList<IMobile> motionElements;
	private final ArrayList<IMotionElement> arrayForDisplay;
	private ILorann lorann;

	public LorannWorld() throws Exception {
		this(20, 12);

	}

	public LorannWorld(final int width, final int height) throws Exception {
		this.elements = new IMotionlessElement[width][height];
		this.motionElements = new ArrayList<IMobile>();
		this.arrayForDisplay = new ArrayList<IMotionElement>();
		if(width != 20) { throw new Exception("Width must be 20");}
		this.width = width;
		if(height != 12) { throw new Exception("Height must be 20");}
		this.height = height;


	}

	public void addElement(final ILorann lorann, final int x, final int y)
	{
		this.setLorann(lorann);
		lorann.setX(x);
		lorann.setY(y);
		this.addElementForDisplay(lorann, x, y);
	}

	public void addElement(final IMobile motionElement, final int x, final int y) {
		motionElement.setX(x);
		motionElement.setY(y);
		this.motionElements.add(motionElement);
		this.addElementForDisplay(motionElement, x, y);
		this.setChanged();
	}

	public void addElement(final IMotionlessElement motionlessElement, final int x, final int y) {

		//System.out.println(motionlessElement.getSymbole());
		this.elements[x][y] = motionlessElement;
		this.setChanged();
	}

	public void addElementForDisplay(final IMotionElement motionElement, final int x, final int y)
	{
		this.arrayForDisplay.add(motionElement);
	}
	public ArrayList<IMotionElement> getArrayForDisplay() {
		return this.arrayForDisplay;
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
	public IMotionlessElement getElement( final int x, final int y){
		return this.elements[x][y];

	}

	public IMotionlessElement getElementByPos(final int x, final int y)
	{
		return this.elements[x][y];
	}
	public IMotionlessElement[][] getElements() {
		return this.elements;
	}

	/* (non-Javadoc)
	 * @see model.ILorannWorld#getHeight()
	 */
	public int getHeight() {
		return this.height;
	}

	public ILorann getLorann() {
		return this.lorann;
	}

	public IMobile getMobileX(final int x)
	{
		return this.motionElements.get(x);
	}

	public ArrayList<IMobile> getMotionElements() {

		return this.motionElements;
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

		//this.elements[0][3] = null;


		for(;;)
		{
			this.setChanged();
			this.notifyObservers();
			try {
				Thread.sleep(125);
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
			for(final IMobile mobile : this.motionElements)
			{
				mobile.getStrategy().animate(mobile, this);
			}
			this.lorann.animate();
			//
			//
		}
	}

	public void setLorann(final ILorann lorann) {
		this.lorann = lorann;
	}
}
