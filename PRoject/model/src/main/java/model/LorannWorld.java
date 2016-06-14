package model;

public class LorannWorld implements ILorannWorld {
	private int width;
	private int height;
	
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
	public Element getElement( int x, int y){
		
	}
	public void addElement(Element element, int x, int y){ 
		
	}
}
