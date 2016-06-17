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
	public static String FIlE_NAME_KNEEPCAP[] = {"Kneepcap.png"};
	public static String FIlE_NAME_HORIZONTALBONE[] = {"HorizontalBone.png"};
	public static String FIlE_NAME_VERTICALBONE[] = {"VerticalBone.png"};
	public static String FIlE_NAME_MONSTER_GOlD[] = {"MonsterGold.png"};
	public static String FIlE_NAME_LORANN[] = {"LorannUp.png", "LorannRightUp.png", "LorannRight.png", "LorannRightDown.png", "LorannDown.png", "LorannLeftDown.png", "LorannLeft.png", "LorannLeftUp.png"};
	public static String FIlE_NAME_SKELETON[] = {"MonsterSkeleton.png"};
	public static String FIlE_NAME_GHOST[] = {"MonsterGhost.png"};
	public static String FIlE_NAME_TOTEM[] = {"MonsterTotem.png"};
	public static String FIlE_NAME_Treasure[] = {"Treasure.png"};
	public static String FIlE_NAME_KEY[] = {"Key.png"};
	public static String FIlE_NAME_SPELL[] = {"SpellCyan.png", "SpellGreen.png", "SpellMagenta.png", "SpellRed.png", "SpellYellow.png"};
	public static String FIlE_NAME_DOOR[] = {"DoorClose.png", "DoorOpen.png"};

	public static MotionlessElement HORIZONTALBONE = new MotionlessElement(new Sprite(FIlE_NAME_HORIZONTALBONE), Permeability.BLOCKING, '-');
	public static MotionlessElement VERTICALBONE = new MotionlessElement(new Sprite(FIlE_NAME_VERTICALBONE), Permeability.BLOCKING, 'l');
	public static MotionlessElement KNEEPCAP = new MotionlessElement(new Sprite(FIlE_NAME_KNEEPCAP), Permeability.BLOCKING, 'o');

	private static MotionlessElement motionlessElements[] = { HORIZONTALBONE, VERTICALBONE, KNEEPCAP, };

	public static ILorann getfromFileSymbolLorann(final char c, final ILorannWorld lorannWorld)
	{
		if(c == 'L') {
			return new Lorann(new Sprite(FIlE_NAME_LORANN), Permeability.BLOCKING, c, lorannWorld);
		}
		return null;
	}

	public static IMobile getFromFileSymbolMotion(final char c, final ILorannWorld lorannWorld) {
		IMobile a = null;
		switch(c){
		case 'G':
			a = new Mobile(new Sprite(FIlE_NAME_MONSTER_GOlD), Permeability.BLOCKING, c, new BehaviorMonsterGold(), lorannWorld);
			break;
		case 'S':
			a = new Mobile(new Sprite(FIlE_NAME_SKELETON), Permeability.BLOCKING, c, new BehaviorMonsterSkeleton(), lorannWorld);
			break;
		case 'g':
			a = new Mobile(new Sprite(FIlE_NAME_GHOST), Permeability.BLOCKING, c, new BehaviorMonsterGhost(), lorannWorld);
			break;
		case 'T':
			a = new Mobile(new Sprite(FIlE_NAME_TOTEM), Permeability.BLOCKING, c, new BehaviorMonsterTotem(), lorannWorld);
			break;
		case 't':
			a = new Mobile(new Sprite(FIlE_NAME_Treasure), Permeability.BLOCKING, c, new BehaviorTreasure(), lorannWorld);
			break;
		case 'k':
			a = new Mobile(new Sprite(FIlE_NAME_KEY), Permeability.BLOCKING, c, new BehaviorKey(), lorannWorld);
			break;
		case 's':
			a = new Mobile(new Sprite(FIlE_NAME_SPELL), Permeability.BLOCKING, c, new BehaviorSpell(), lorannWorld);
			break;
		case 'd':
			a = new Mobile(new Sprite(FIlE_NAME_DOOR), Permeability.BLOCKING, c, new BehaviorDoor(), lorannWorld);
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
