package contract;

import java.util.ArrayList;
import java.util.Observable;

public interface ILorannWorld {

	public void addMotionElement(IMotionElement mobile, int x , int y);

	public void addMotionlessElement(IMotionElement motionlessElement, int x, int y);

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