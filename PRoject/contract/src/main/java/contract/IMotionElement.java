package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMotionElement.
 */
public interface IMotionElement extends IElement{
	
	/**
	 * Execute move if possible.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the boolean
	 */
	public Boolean executeMoveIfPossible( final int x, final int y);
	
	/**
	 * Gets the lorann world.
	 *
	 * @return the lorann world
	 */
	public ILorannWorld getLorannWorld();
	
	/**
	 * Gets the save X.
	 *
	 * @return the save X
	 */
	public int getSaveX();
	
	/**
	 * Gets the save Y.
	 *
	 * @return the save Y
	 */
	public int getSaveY();
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX();
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY();
	
	/**
	 * Kill element.
	 *
	 * @param motionElement the motion element
	 */
	public void killElement(IMotionElement motionElement);
	
	/**
	 * Save position.
	 */
	public void savePosition();
	
	/**
	 * Sets the save X.
	 *
	 * @param saveX the new save X
	 */
	public void setSaveX(final int saveX);
	
	/**
	 * Sets the save Y.
	 *
	 * @param saveX the new save Y
	 */
	public void setSaveY(final int saveX);
	
	/**
	 * Sets the x.
	 *
	 * @param x the new x
	 */
	public void setX(int x);
	
	/**
	 * Sets the y.
	 *
	 * @param y the new y
	 */
	public void setY(int y);
}
