package contract;

import java.awt.Image;

public interface ISprite {

	void changecurentImage(final int x);

	void changeToNextImage();

	Image getImage();
}
