package model.lorannWorld.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import contract.ISprite;

public class Sprite implements ISprite{

	private final Image ListImage[];
	private Image currentImage;
	private int currentImageStep;


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

	public void changecurentImage(final int x)
	{
		if(x < this.ListImage.length) {
			this.currentImage = this.ListImage[x];
			this.currentImageStep = x;
		}
	}

	public void changeToNextImage()
	{
		this.currentImage = this.ListImage[(this.currentImageStep++)%this.ListImage.length];
	}

	public int getCurrentStep()
	{
		return this.currentImageStep;
	}

	public Image getImage(){
		return this.currentImage;
	}
}
