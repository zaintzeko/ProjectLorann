package contract;

import java.util.ArrayList;
import java.util.Observable;

// TODO: Auto-generated Javadoc
/**
 * The Interface ILorannWorld.
 */
public interface ILorannWorld {

	/**
	 * Adds the element.
	 *
	 * @param motionElement the motion element
	 * @param x the x
	 * @param y the y
	 */
	public void addElement(IMobile motionElement, int x , int y);

	/**
	 * Adds the element.
	 *
	 * @param motionlessElement the motionless element
	 * @param x the x
	 * @param y the y
	 */
	public void addElement(IMotionlessElement motionlessElement, int x, int y);

	/**
	 * Adds the score.
	 *
	 * @param x the x
	 */
	public void addScore(int x);

	/**
	 * Gets the element.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the element
	 */
	public IMotionlessElement getElement(int x, int y);

	/**
	 * Gets the elements.
	 *
	 * @return the elements
	 */
	public IMotionlessElement[][] getElements();

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	int getHeight();

	/**
	 * Gets the lorann.
	 *
	 * @return the lorann
	 */
	public ILorann getLorann();

	/**
	 * Gets the mobile X.
	 *
	 * @param x the x
	 * @return the mobile X
	 */
	public IMobile getMobileX(final int x);

	/**
	 * Gets the motion elements.
	 *
	 * @return the motion elements
	 */
	public ArrayList<IMobile> getMotionElements();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	/**
	 * Gets the score.
	 *
	 * @return the score
	 */
	public int getScore();

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	int getWidth();

	/**
	 * Play.
	 */
	public void play();

	/**
	 * Removes the mobile.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if successful
	 */
	public boolean removeMobile(final int x, final int y);

	/**
	 * Sets the win.
	 *
	 * @param win the new win
	 */
	public void setWin(final int win);
	
	/**
	 * Adds the element.
	 *
	 * @param lorann the lorann
	 * @param x the x
	 * @param y the y
	 */
	public void addElement(final ILorann lorann, final int x, final int y);
}