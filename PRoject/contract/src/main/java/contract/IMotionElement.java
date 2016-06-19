package contract;

public interface IMotionElement extends IElement{
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	public boolean moveUp();
	public boolean moveDown();
	public boolean moveRight();
	public boolean moveLeft();
	public boolean moveLeftUp();
	public boolean moveLeftDown();
	public boolean moveRightUp();
	public boolean moveRightDown();
	Boolean executeMoveIfPossible(int x, int y);

}
