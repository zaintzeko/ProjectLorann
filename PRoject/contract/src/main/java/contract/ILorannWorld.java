package contract;

import java.util.ArrayList;

public interface ILorannWorld {

	int getWidth();

	int getHeight();

	public IMotionlessElement getElement(int x, int y);

	public void addMotionlessElement(IMotionElement motionlessElement, int x, int y);
	
	public IMotionlessElement[][] getMotionlessElements();
	
	public void addMotionElement(IMotionElement mobile, int x , int y);
	
	public ArrayList<IMotionElement> getMotionElements();
}