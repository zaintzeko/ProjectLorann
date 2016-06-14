package model.lorannWorld.element.motion;

import model.lorannWorld.element.ISprite;

public class Monster extends MotionElement implements IMonster{
	private IBehaviorAnimate behaviorAnimate;
	public Monster(ISprite sprite)
	{
		super(sprite);
		this.behaviorAnimate = new BehaviorAnimate();
	}

	public void getAnimate() {
		// TODO Auto-generated method stub
		
	}
}