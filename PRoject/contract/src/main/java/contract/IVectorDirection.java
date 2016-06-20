package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IVectorDirection.
 */
public interface IVectorDirection {

	/**
	 * Change vector to image number.
	 *
	 * @param vector the vector
	 * @param currentImage the current image
	 * @return the int
	 */
	public int changeVectorToImageNumber(final IVectorDirection vector, final int currentImage);

	/**
	 * Gets the number of spell.
	 *
	 * @return the number of spell
	 */
	int getNumberOfSpell();

	/**
	 * Gets the vector X.
	 *
	 * @return the vector X
	 */
	int getVectorX();

	/**
	 * Gets the vector Y.
	 *
	 * @return the vector Y
	 */
	int getVectorY();

	/**
	 * Sets the number of spell.
	 *
	 * @param numberOfSpell the new number of spell
	 */
	void setNumberOfSpell(int numberOfSpell);

	/**
	 * Sets the vector X.
	 *
	 * @param vecteurX the new vector X
	 */
	void setVectorX(int vecteurX);

	/**
	 * Sets the vector Y.
	 *
	 * @param vecteurY the new vector Y
	 */
	void setVectorY(int vecteurY);
}