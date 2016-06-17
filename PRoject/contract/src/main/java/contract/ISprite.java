package contract;

import java.awt.Image;

public interface ISprite {

	public void changecurentImage(final int x);

	public void changeToNextImage();

	Image getImage();

	public int getCurrentStep();
}
