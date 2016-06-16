package model.lorannWorld.element;

import contract.IElement;
import model.lorannWorld.element.motion.BehaviorKey;
import model.lorannWorld.element.motion.BehaviorMonsterGhost;
import model.lorannWorld.element.motion.BehaviorMonsterGold;
import model.lorannWorld.element.motion.BehaviorMonsterSkeleton;
import model.lorannWorld.element.motion.BehaviorMonsterTotem;
import model.lorannWorld.element.motion.BehaviorSpell;
import model.lorannWorld.element.motion.BehaviorTreasure;
import model.lorannWorld.element.motion.Mobile;
import model.lorannWorld.element.motion.MotionElement;
import model.lorannWorld.element.motionless.MotionlessElement;

public abstract class  FactoryElement {

	public static MotionlessElement HORIZONTALBONE = new MotionlessElement(new Sprite("HorizontalBone.png"), Permeability.BLOCKING, '-');
	public static MotionlessElement VERTICALBONE = new MotionlessElement(new Sprite("VerticalBone.png"), Permeability.BLOCKING, 'l');
	public static MotionlessElement KNEEPCAP = new MotionlessElement(new Sprite("Kneepcap.png"), Permeability.BLOCKING, 'o');

	private static MotionElement MONSTERGOLD = new Mobile(new Sprite("MonsterGold.png"), Permeability.BLOCKING, 'G', new BehaviorMonsterGold());
	private static MotionElement MONSTERSKELETON = new Mobile(new Sprite("MonsterSkeleton.png"), Permeability.BLOCKING, 'S', new BehaviorMonsterSkeleton());
	private static MotionElement MONSTERGHOST = new Mobile(new Sprite("MonsterGhost.png"), Permeability.BLOCKING, 'g', new BehaviorMonsterTotem());
	private static MotionElement MONSTERTOTEM = new Mobile(new Sprite("MonsterTotem.png"), Permeability.BLOCKING, 'T', new BehaviorMonsterGhost());
	private static MotionElement SPELL = new Mobile(new Sprite("SpellCyan.png"), Permeability.BLOCKING, 's', new BehaviorSpell());
	private static MotionElement TREASURE = new Mobile(new Sprite("Treasure.png"), Permeability.BLOCKING, 't', new BehaviorTreasure());
	private static MotionElement KEY = new Mobile(new Sprite("Key.png"), Permeability.BLOCKING, 'k', new BehaviorKey());

	private static MotionlessElement motionlessElements[] = { HORIZONTALBONE, VERTICALBONE, KNEEPCAP, };
	private static MotionElement motionElelements[]={MONSTERGOLD,MONSTERSKELETON,MONSTERGHOST,MONSTERTOTEM,SPELL,TREASURE,KEY,};

	public static IElement getFromFileSymbol(final char c) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSymbole() == c) {
				return motionlessElement;
			}
		}
		for (final MotionElement motionlessElement : motionElelements) {
			if (motionlessElement.getSymbole() == c) {
				return motionlessElement;
			}
		}
		return null;
	}

	public static IElement getFromStringName(final String c) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.toString() == c) {
				return motionlessElement;
			}
		}
		for (final MotionElement motionlessElement : motionElelements) {
			if (motionlessElement.toString() == c) {
				return motionlessElement;
			}
		}
		return null;
	}

}
