package controller;

import contract.IVectorDirection;

public class VecteurDirection implements IVectorDirection {
	private int  vecteurX;
	private int vecteurY;
	private int numberOfSpell;

	public VecteurDirection()
	{
		this.vecteurX = 0;
		this.vecteurY = 0;
	}

	public int changeVecteurToImageNumber(final IVectorDirection vecteur, final int currentImage)
	{
		if((this.vecteurX == 0) && (this.vecteurY < 0)){
			return 0;
		}
		else if((this.vecteurX > 0) && (this.vecteurY < 0)){
			return 1;
		}
		else if((this.vecteurX > 0) && (this.vecteurY == 0)){
			return 2;
		}
		else if((this.vecteurX > 0) && (this.vecteurY > 0)){
			return 3;
		}
		else if((this.vecteurX == 0) && (this.vecteurY > 0)){
			return 4;
		}
		else if((this.vecteurX < 0) && (this.vecteurY > 0)){
			return 5;
		}
		else if((this.vecteurX < 0) && (this.vecteurY == 0)){
			return 6;
		}
		else if((this.vecteurX < 0) && (this.vecteurY > 0)){
			return 7;
		} else {
			return (currentImage + 1)%8;
		}
	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#getVecteurX()
	 */
	public int getVecteurX() {
		return this.vecteurX;
	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#getVecteurY()
	 */
	public int getVecteurY() {
		return this.vecteurY;
	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#setVecteurX(int)
	 */
	public void setVecteurX(final int vecteurX) {
		this.vecteurX = vecteurX;
	}

	/* (non-Javadoc)
	 * @see controller.IVecteurDirection#setVecteurY(int)
	 */
	public void setVecteurY(final int vecteurY) {
		this.vecteurY = vecteurY;
	}

	public int getNumberOfSpell() {
		return this.numberOfSpell;
	}

	public void setNumberOfSpell(int numberOfSpell) {
		this.numberOfSpell = numberOfSpell;
		
	}
}
