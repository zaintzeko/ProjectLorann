package model.lorannWorld.element;

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

	public static MotionlessElement HORIZONTALBONE = new MotionlessElement(null, Permeability.BLOCKING, 'l');
	public static MotionlessElement VERTICALBONE = new MotionlessElement(null, Permeability.BLOCKING, '-');
	public static MotionlessElement KNEEPCAP = new MotionlessElement(null, Permeability.BLOCKING, 'o');

	private static MotionElement MONSTERGOLD = new Mobile(null, Permeability.BLOCKING, 'T', new BehaviorMonsterGold());
	private static MotionElement MONSTERSKELETON = new Mobile(null, Permeability.BLOCKING, 'T', new BehaviorMonsterSkeleton());
	private static MotionElement MONSTERGHOST = new Mobile(null, Permeability.BLOCKING, 'T', new BehaviorMonsterTotem());
	private static MotionElement MONSTERTOTEM = new Mobile(null, Permeability.BLOCKING, 'T', new BehaviorMonsterGhost());
	private static MotionElement SPELL = new Mobile(null, Permeability.BLOCKING, 'T', new BehaviorSpell());
	private static MotionElement TREASURE = new Mobile(null, Permeability.BLOCKING, 'T', new BehaviorTreasure());
	private static MotionElement KEY = new Mobile(null, Permeability.BLOCKING, 'T', new BehaviorKey());

	private static MotionlessElement motionlessElements[] = { HORIZONTALBONE, VERTICALBONE, KNEEPCAP };

	public static MotionlessElement getFromFileSymbol(final char c) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSymbole() == c) {
				return motionlessElement;
			}
		}
		return null;
	}

	public static MotionlessElement getFromStringName(final String c) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.toString() == c) {
				return motionlessElement;
			}
		}
		return null;
	}
}
