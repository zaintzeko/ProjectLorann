package contract;


public interface IMobile extends IMotionElement{

	IStrategy getStrategy();

	Boolean executeMoveIfPossible(int x, int y);

}