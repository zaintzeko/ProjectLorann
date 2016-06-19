package contract;

public interface IMotionElement extends IElement{
	public Boolean executeMoveIfPossible( final int x, final int y);
	public ILorannWorld getLorannWorld();
	public int getSaveX();
	public int getSaveY();
	public int getX();
	public int getY();
	public void killElement(IMotionElement motionElement);
	public void moveDown();
	public void moveLeft();
	public void moveLeftDown();
	public void moveLeftUp();
	public void moveRight();
	public void moveRightDown();
	public void moveRightUp();
	public void moveUp();
	public void savePosition();
	public void setSaveX(final int saveX);
	public void setSaveY(final int saveX);
	public void setX(int x);
	public void setY(int y);
}
