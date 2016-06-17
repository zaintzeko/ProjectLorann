package contract;

public interface IStrategy{
	public void actionOnHit();
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld);
}
