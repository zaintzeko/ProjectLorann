package model.lorannWorld;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IMotionlessElement;

public class LorannWorld implements ILorannWorld {
	private int width;
	private int height;
	private IMotionlessElement elements[][];
	
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
	public void addElement(IMotionElement motionElement, int x, int y){ 
		
		
	}
}
