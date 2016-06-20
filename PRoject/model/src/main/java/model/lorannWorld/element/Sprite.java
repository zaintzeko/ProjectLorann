package model.lorannWorld.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ISprite;

// TODO: Auto-generated Javadoc
/**
 * The Class Sprite.
 */
public class Sprite implements ISprite{

	/** The List image. */
	private final Image ListImage[];
	
	/** The current image. */
	private Image currentImage;
	
	/** The current image step. */
	private int currentImageStep;


	/**
	 * Instantiates a new sprite.
	 *
	 * @param string the string
	 */
	public Sprite(final String string[]){
		this.ListImage = new Image[string.length];
		int i = 0;
		for(final String path : string){
			try {
				this.ListImage[i] = ImageIO.read(new File("Image/" + path));
			} catch (final IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		this.changecurentImage(0);
	}

	/* (non-Javadoc)
	 * @see contract.ISprite#changecurentImage(int)
	 */
	public void changecurentImage(final int x)
	{
		if(x < this.ListImage.length) {
			this.currentImage = this.ListImage[x];
			this.currentImageStep = x;
		}
	}

	/* (non-Javadoc)
	 * @see contract.ISprite#changeToNextImage()
	 */
	public void changeToNextImage()
	{
		this.currentImage = this.ListImage[(this.currentImageStep++)%this.ListImage.length];
	}

	/* (non-Javadoc)
	 * @see contract.ISprite#getCurrentStep()
	 */
	public int getCurrentStep()
	{
		return this.currentImageStep;
	}

	/* (non-Javadoc)
	 * @see contract.ISprite#getImage()
	 */
	public Image getImage(){
		return this.currentImage;
	}
}
