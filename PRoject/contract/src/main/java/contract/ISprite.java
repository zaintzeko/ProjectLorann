package contract;

import java.awt.Image;

// TODO: Auto-generated Javadoc
/**
 * The Interface ISprite.
 */
public interface ISprite {

	/**
	 * Changecurent image.
	 *
	 * @param x the x
	 */
	public void changecurentImage(final int x);

	/**
	 * Change to next image.
	 */
	public void changeToNextImage();

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	Image getImage();

	/**
	 * Gets the current step.
	 *
	 * @return the current step
	 */
	public int getCurrentStep();
}
