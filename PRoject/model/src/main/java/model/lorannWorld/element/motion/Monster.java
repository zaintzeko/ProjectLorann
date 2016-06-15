package model.lorannWorld.element.motion;

import model.lorannWorld.element.ISprite;
import model.lorannWorld.element.MotionElement;
import model.lorannWorld.element.Permeability;

public class Monster extends MotionElement implements IMonster{
	private IBehaviorAnimate behaviorAnimate;
	public Monster(ISprite sprite,Permeability permeability)
	{
		super(sprite,permeability);
		this.behaviorAnimate = new BehaviorAnimate();
	}

	public void getAnimate() {
		// TODO Auto-generated method stub
		
	}
}