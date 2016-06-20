package controller;

import contract.IVectorDirection;

// TODO: Auto-generated Javadoc
/**
 * The Class VectorDirection.
 */
public class VectorDirection implements IVectorDirection {
	
	/** The vector X. */
	private int  vectorX;
	
	/** The vector Y. */
	private int vectorY;
	
	/** The number of spell. */
	private int numberOfSpell;

	/**
	 * Instantiates a new vector direction.
	 */
	public VectorDirection()
	{
		this.vectorX = 0;
		this.vectorY = 0;
	}

	/* (non-Javadoc)
	 * @see contract.IVectorDirection#changeVecteurToImageNumber(contract.IVectorDirection, int)
	 */
	public int changeVectorToImageNumber(final IVectorDirection vector, final int currentImage)
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

	/* (non-Javadoc)
	 * @see contract.IVectorDirection#getNumberOfSpell()
	 */
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

	/* (non-Javadoc)
	 * @see contract.IVectorDirection#setNumberOfSpell(int)
	 */
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
