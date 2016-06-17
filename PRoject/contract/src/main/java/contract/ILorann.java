package contract;

public interface ILorann extends IMotionElement{

	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	void animate(IMotionElement motionElement,ILorannWorld lorannWorld);

}