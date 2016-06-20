package contract;

public interface ILorann extends IMotionElement{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	void animate();

	public IMobile getSpell();

	public IVectorDirection getVecteurOrder();

	public int getXSpell();

	public int getYSpell();

	public void setSpell();

	public void setVecteurOrder(final IVectorDirection vecteurOrder);

	public void setXSpell(int Xspell);

	public void setYSpell(int YSpell);

}