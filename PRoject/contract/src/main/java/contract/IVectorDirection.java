package contract;

public interface IVectorDirection {

	public int changeVecteurToImageNumber(final IVectorDirection vecteur, final int currentImage);

	int getVecteurX();

	int getVecteurY();

	void setVecteurX(int vecteurX);

	void setVecteurY(int vecteurY);
	
	int getNumberOfSpell();
	
	void setNumberOfSpell(int numberOfSpell);
}