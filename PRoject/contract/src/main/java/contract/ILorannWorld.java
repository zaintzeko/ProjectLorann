package contract;

public interface ILorannWorld {

	int getWidth();

	int getHeight();

	public IMotionlessElement getElement(int x, int y);

	public void addElement(IMotionElement motionElement, int x, int y);

}