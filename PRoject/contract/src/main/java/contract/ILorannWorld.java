package contract;

import java.util.ArrayList;
import java.util.Observable;

public interface ILorannWorld {

	public void addElement(IMotionElement motionElement, int x , int y);

	public void addElement(IMotionlessElement motionlessElement, int x, int y);

	public IElement getElement(int x, int y);

	int getHeight();

	public ArrayList<IMotionElement> getMotionElements();

	public IElement[][] getMotionlessElements();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	int getWidth();
}