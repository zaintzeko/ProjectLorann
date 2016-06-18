package contract;

public interface IMotionElement extends IElement{
	public ILorannWorld getLorannWorld();
	public int getX();
	public int getY();
	public void killElement(IMotionElement motionElement);
	public boolean moveDown();
	public boolean moveLeft();
	public boolean moveLeftDown();
	public boolean moveLeftUp();
	public boolean moveRight();
	public boolean moveRightDown();
	public boolean moveRightUp();
	public boolean moveUp();
	public void setX(int x);
	public void setY(int y);

}
