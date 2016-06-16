package model.lorannWorld;

import java.util.ArrayList;
import java.util.Observable;

import contract.IElement;
import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IMotionlessElement;
import model.lorannWorld.element.motionless.MotionlessElement;

public class LorannWorld extends Observable implements ILorannWorld {
	private final int width;
	private final int height;
	private IElement elements[][];
	public ArrayList<IMotionElement> motionElements;

	public LorannWorld() {
		this(20, 12);

	}

	public LorannWorld(final int width, final int height) {
		this.width = width;
		this.height = height;

	}
	public void addElement(final MotionlessElement fromFileSymbol, final int int1, final int int2) {
		// TODO Auto-generated method stub

	}

	public void addMotionElement(final IMotionElement motionELement, final int x, final int y) {
		motionELement.setX(x);
		motionELement.setY(y);
		this.motionElements.add(motionELement);
		// TODO Auto-generated method stub

	}
	/* (non-Javadoc)
	 * @see model.ILorannWorld#addElement(model.Element, int, int)
	 */
	public void addMotionlessElement(final IMotionlessElement motionlessElement, final int x, final int y){
		this.elements[x][y] = motionlessElement;
		//if (motionlessElement != null) {motionlessElement.setLorannWorld(this);}
	}
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

}
