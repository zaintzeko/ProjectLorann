package model.lorannWorld;

import java.util.ArrayList;
import java.util.Observable;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IMotionlessElement;

public class LorannWorld extends Observable implements ILorannWorld {
	private int width;
	private int height;
	private IMotionlessElement elements[][];
	public ArrayList<IMotionElement> motionElements;
	public LorannWorld(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	/* (non-Javadoc)
	 * @see model.ILorannWorld#getWidth()
	 */
	public int getWidth() {
		return width;
	}

	/* (non-Javadoc)
	 * @see model.ILorannWorld#getHeight()
	 */
	public int getHeight() {
		return height;
	}
	/* (non-Javadoc)
	 * @see model.ILorannWorld#getElement(int, int)
	 */
	public IMotionlessElement getElement( int x, int y){
		return this.elements[x][y];
		
	}
	/* (non-Javadoc)
	 * @see model.ILorannWorld#addElement(model.Element, int, int)
	 */
	public void addMotionlessElement(IMotionElement motionlessElement, int x, int y){ 
		this.elements[x][y] = (IMotionlessElement) motionlessElement;
		//if (motionElement != null) {motionElement.setLorannWorld(this);}
	}

	public void addMotionElement(IMotionElement motionELement, int x, int y) {
		motionELement.setX(x);
		motionELement.setY(y);
		this.motionElements.add(motionELement);
		// TODO Auto-generated method stub
		
	}	
	
	public IMotionlessElement[][] getMotionlessElements() {
		return this.elements;
	}
	
	public ArrayList<IMotionElement> getMotionElements() {
		
		return this.motionElements;
	}

}
