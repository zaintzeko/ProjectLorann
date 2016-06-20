package contract;

// TODO: Auto-generated Javadoc
/**
 * The Interface IStrategy.
 */
public interface IStrategy {
	
	/**
	 * Action on hit.
	 *
	 * @param motionElement the motion element
	 * @param lorannWorld the lorann world
	 */
	public void actionOnHit(final IMotionElement motionElement, ILorannWorld lorannWorld);
	
	/**
	 * Animate.
	 *
	 * @param motionElement the motion element
	 * @param lorannWorld the lorann world
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld);
}
