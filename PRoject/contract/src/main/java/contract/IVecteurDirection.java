package contract;

public interface IVecteurDirection {

	public int changeVecteurToImageNumber(final IVecteurDirection vecteur, final int currentImage);

	int getVecteurX();

	int getVecteurY();

	void setVecteurX(int vecteurX);

	void setVecteurY(int vecteurY);
}