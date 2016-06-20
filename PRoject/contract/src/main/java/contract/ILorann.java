package contract;

public interface ILorann extends IMotionElement{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	void animate();

	public IMobile getSpell();

	public IVectorDirection getVectorOrder();

	public int getXSpell();

	public int getYSpell();

	public void setSpell();

	public void setVectorOrder(final IVectorDirection vectorOrder);

	public void setXSpell(int Xspell);

	public void setYSpell(int YSpell);

}