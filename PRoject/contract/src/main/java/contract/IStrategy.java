package contract;

public interface IStrategy {
	public void actionOnHit(final IMotionElement motionElement, ILorannWorld lorannWorld);
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld);
}
