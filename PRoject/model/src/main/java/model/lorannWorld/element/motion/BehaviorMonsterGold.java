package model.lorannWorld.element.motion;



import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterGold extends Monster implements IStrategy{



	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(final IMotionElement motionElement,final ILorannWorld lorannWorld) {
		boolean a = false;

		if(lorannWorld.getLorann().getY()<motionElement.getY()){
			a = motionElement.moveUp();

		}
		else {
			if (lorannWorld.getLorann().getX()<motionElement.getX()){
				a = motionElement.moveLeft();
			}
		}
		else{
			if (lorannWorld.getLorann().getX()>motionElement.getX()){
				a = motionElement.moveRight();
			}
		}
		if (lorannWorld.getLorann().getY()>motionElement.getY()){
			a = motionElement.moveDown();

		}



		if ((lorannWorld.getLorann().getY()<motionElement.getY()) && (lorannWorld.getLorann().getX()<motionElement.getX()) && !a){
			a = motionElement.moveLeftUp();
		}
		if ((lorannWorld.getLorann().getY()<motionElement.getY()) && (lorannWorld.getLorann().getX()>motionElement.getX()) && !a){
			a = motionElement.moveRightUp();
		}
		if ((lorannWorld.getLorann().getY()>motionElement.getY()) && (lorannWorld.getLorann().getX()<motionElement.getX()) && !a){
			a = motionElement.moveLeftDown();
		}
		if ((lorannWorld.getLorann().getY()>motionElement.getY()) && (lorannWorld.getLorann().getX()>motionElement.getX()) && !a){
			a = motionElement.moveRightDown();
		}
	}

}
