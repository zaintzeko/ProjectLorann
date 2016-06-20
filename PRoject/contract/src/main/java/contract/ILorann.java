package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface ILorann.
 */
public interface ILorann extends IMotionElement{

	/**
	 * Animate.
	 */
	void animate();

	/**
	 * Gets the spell.
	 *
	 * @return the spell
	 */
	public IMobile getSpell();

	/**
	 * Gets the vector order.
	 *
	 * @return the vector order
	 */
	public IVectorDirection getVectorOrder();

	/**
	 * Gets the x spell.
	 *
	 * @return the x spell
	 */
	public int getXSpell();

	/**
	 * Gets the y spell.
	 *
	 * @return the y spell
	 */
	public int getYSpell();

	/**
	 * Sets the spell.
	 */
	public void setSpell();

	/**
	 * Sets the vector order.
	 *
	 * @param vectorOrder the new vector order
	 */
	public void setVectorOrder(final IVectorDirection vectorOrder);

	/**
	 * Sets the x spell.
	 *
	 * @param Xspell the new x spell
	 */
	public void setXSpell(int Xspell);

	/**
	 * Sets the y spell.
	 *
	 * @param YSpell the new y spell
	 */
	public void setYSpell(int YSpell);

}