package contract;

public interface IVectorDirection {

	public int changeVecteurToImageNumber(final IVectorDirection vecteur, final int currentImage);

	int getNumberOfSpell();

	int getVectorX();

	int getVectorY();

	void setNumberOfSpell(int numberOfSpell);

	void setVectorX(int vecteurX);

	void setVectorY(int vecteurY);
}