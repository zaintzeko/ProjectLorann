package contract;

import java.util.ArrayList;
import java.util.Observable;

public interface ILorannWorld {

	public void addElement(IMobile motionElement, int x , int y);

	public void addElement(IMotionlessElement motionlessElement, int x, int y);

	public void addElementForDisplay(IMotionElement motionElement, int x, int y);

	public ArrayList<IMotionElement> getArrayForDisplay();

	public IElement getElement(int x, int y);

	public IElement[][] getElements();

	int getHeight();

	public ArrayList<IMobile> getMotionElements();

	public IElement[][] getMotionlessElements();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	int getWidth();

	public void play();
}