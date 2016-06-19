package contract;

public interface ILorann extends IMotionElement{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	void animate();

	public void setKeyCode(final ControllerOrder keyCode);

	public void setVecteurOrder(final IVecteurDirection vecteurOrder);
	
	public IVecteurDirection getVecteurOrder();
	
	public int getYSpell();
	public int getXSpell();
	
	public void setXSpell(int Xspell);
	public void setYSpell(int YSpell);

}