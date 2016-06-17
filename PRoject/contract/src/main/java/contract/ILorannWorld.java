package contract;

import java.util.ArrayList;
import java.util.Observable;

public interface ILorannWorld {

	public void addElement(IMobile motionElement, int x , int y);

	public void addElement(IMotionlessElement motionlessElement, int x, int y);

	public void addElementForDisplay(IMotionElement motionElement, int x, int y);
	

	public ArrayList<IMotionElement> getArrayForDisplay();

	public IMotionlessElement getElement(int x, int y);

	public IMotionlessElement[][] getElements();

	int getHeight();

	public ArrayList<IMobile> getMotionElements();
	
	public ILorann getLorann();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	int getWidth();

	public void play();
}