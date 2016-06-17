package model.lorannWorld.element;

import contract.ILorann;
import contract.ILorannWorld;
import contract.IMobile;
import contract.IMotionlessElement;
import model.lorannWorld.element.motion.BehaviorDoor;
import model.lorannWorld.element.motion.BehaviorKey;
import model.lorannWorld.element.motion.BehaviorMonsterGhost;
import model.lorannWorld.element.motion.BehaviorMonsterGold;
import model.lorannWorld.element.motion.BehaviorMonsterSkeleton;
import model.lorannWorld.element.motion.BehaviorMonsterTotem;
import model.lorannWorld.element.motion.BehaviorSpell;
import model.lorannWorld.element.motion.BehaviorTreasure;
import model.lorannWorld.element.motion.Lorann;
import model.lorannWorld.element.motion.Mobile;
import model.lorannWorld.element.motionless.MotionlessElement;

public abstract class  FactoryElement {

	public static MotionlessElement HORIZONTALBONE = new MotionlessElement(new Sprite("HorizontalBone.png"), Permeability.BLOCKING, '-');
	public static MotionlessElement VERTICALBONE = new MotionlessElement(new Sprite("VerticalBone.png"), Permeability.BLOCKING, 'l');
	public static MotionlessElement KNEEPCAP = new MotionlessElement(new Sprite("Kneepcap.png"), Permeability.BLOCKING, 'o');

	private static MotionlessElement motionlessElements[] = { HORIZONTALBONE, VERTICALBONE, KNEEPCAP, };

	public static ILorann getfromFileSymbolLorann(final char c, final ILorannWorld lorannWorld)
	{
		if(c == 'L') {
			return new Lorann(new Sprite("LorannUp.png"), Permeability.BLOCKING, c, lorannWorld);
		}
		return null;
	}

	public static IMobile getFromFileSymbolMotion(final char c, final ILorannWorld lorannWorld) {
		IMobile a = null;
		switch(c){
		case 'G':
			a = new Mobile(new Sprite("MonsterGold.png"), Permeability.BLOCKING, c, new BehaviorMonsterGold(), lorannWorld);
			break;
		case 'S':
			a = new Mobile(new Sprite("MonsterSkeleton.png"), Permeability.BLOCKING, c, new BehaviorMonsterSkeleton(), lorannWorld);
			break;
		case 'g':
			a = new Mobile(new Sprite("MonsterGhost.png"), Permeability.BLOCKING, c, new BehaviorMonsterGhost(), lorannWorld);
			break;
		case 'T':
			a = new Mobile(new Sprite("MonsterTotem.png"), Permeability.BLOCKING, c, new BehaviorMonsterTotem(), lorannWorld);
			break;
		case 't':
			a = new Mobile(new Sprite("Treasure.png"), Permeability.BLOCKING, c, new BehaviorTreasure(), lorannWorld);
			break;
		case 'k':
			a = new Mobile(new Sprite("Key.png"), Permeability.BLOCKING, c, new BehaviorKey(), lorannWorld);
			break;
		case 's':
			a = new Mobile(new Sprite("Spell.png"), Permeability.BLOCKING, c, new BehaviorSpell(), lorannWorld);
			break;
		case 'd':
			a = new Mobile(new Sprite("DoorClose.png"), Permeability.BLOCKING, c, new BehaviorDoor(), lorannWorld);
			break;
		default:
			a=null;
			break;
		}
		return a;
	}

	public static IMotionlessElement getFromFileSymbolMotionless(final char c) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSymbole() == c) {
				return motionlessElement;
			}
		}
		return null;
	}
}
