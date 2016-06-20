package model.lorannWorld.element.motion;

import java.util.Random;

import contract.ILorannWorld;
import contract.IMotionElement;
import contract.IStrategy;

public class BehaviorMonsterTotem extends Monster implements IStrategy{
	/* (non-Javadoc)
	 * @see model.IBehaviorMonsterSkeleton#animate()
	 */
	public void animate(IMotionElement motionElement,ILorannWorld lorannWorld) {
		
		Random rand = new Random();
		int Nomber = rand.nextInt(8);
		System.out.println(Nomber);
		
		switch(Nomber){
		
		case '0':
			
			if(lorannWorld.getLorann().getY()<motionElement.getY()){
				motionElement.setY(motionElement.getY()-1);}
		
			break;
		case '1':
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setY(motionElement.getY()-1);;
			}
		
			break;
		case '2':
			if (lorannWorld.getLorann().getX()>motionElement.getX()){
				motionElement.setX(motionElement.getX()+1);}
			break;
		case '3':
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setX(motionElement.getX()+1);
			}
			break;
		case '4':
			if (lorannWorld.getLorann().getY()>motionElement.getY()){
				motionElement.setY(motionElement.getY()+1);}
			break;
		case '5':
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setY(motionElement.getY()+1);
			}
			break;
		case '6':
			if (lorannWorld.getLorann().getX()<motionElement.getX()){
				motionElement.setX(motionElement.getX()-1);}
				break;
		case '7':
			if(!motionElement.executeMoveIfPossible(motionElement.getX(), motionElement.getY())) {
				motionElement.setX(motionElement.getX()-1);
			}
			
			default:
			
		}
		
		
		
		
		
	}
}
