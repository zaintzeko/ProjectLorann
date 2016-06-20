package controller;

import contract.IVectorDirection;

public class VectorDirection implements IVectorDirection {
	private int  vectorX;
	private int vectorY;
	private int numberOfSpell;

	public VectorDirection()
	{
		this.vectorX = 0;
		this.vectorY = 0;
	}

	public int changeVecteurToImageNumber(final IVectorDirection vecteur, final int currentImage)
	{
		if((this.vectorX == 0) && (this.vectorY < 0)){
			return 0;
		}
		else if((this.vectorX > 0) && (this.vectorY < 0)){
			return 1;
		}
		else if((this.vectorX > 0) && (this.vectorY == 0)){
			return 2;
		}
		else if((this.vectorX > 0) && (this.vectorY > 0)){
			return 3;
		}
		else if((this.vectorX == 0) && (this.vectorY > 0)){
			return 4;
		}
		else if((this.vectorX < 0) && (this.vectorY > 0)){
			return 5;
		}
		else if((this.vectorX < 0) && (this.vectorY == 0)){
			return 6;
		}
		else if((this.vectorX < 0) && (this.vectorY < 0)){
			return 7;
		} else {
			return (currentImage + 1)%8;
		}
	}

	public int getNumberOfSpell() {
		return this.numberOfSpell;
	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#getVecteurX()
	 */
	public int getVectorX() {
		return this.vectorX;
	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#getVecteurY()
	 */
	public int getVectorY() {
		return this.vectorY;
	}

	public void setNumberOfSpell(final int numberOfSpell) {
		this.numberOfSpell = numberOfSpell;

	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#setVecteurX(int)
	 */
	public void setVectorX(final int vectorX) {
		this.vectorX = vectorX;
	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#setVecteurY(int)
	 */
	public void setVectorY(final int vectorY) {
		this.vectorY = vectorY;
	}
}
