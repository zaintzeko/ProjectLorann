package contract;

import java.util.ArrayList;

public interface ILorannWorld {

	int getWidth();

	int getHeight();

	public IMotionlessElement getElement(int x, int y);

	public void addElement(IMotionElement motionElement, int x, int y);
	
	public IMotionlessElement[][] getMotionlessElements(int x, int y);
	
	public void addMotionElement(IMotionElement mobile, int x , int y);
	
	public ArrayList<IMotionElement> getMotionElements(int x);
}