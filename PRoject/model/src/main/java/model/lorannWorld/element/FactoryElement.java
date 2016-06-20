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
import model.lorannWorld.element.motion.Spell;
import model.lorannWorld.element.motionless.MotionlessElement;

// TODO: Auto-generated Javadoc
/**
 * The Class FactoryElement.
 */
public abstract class  FactoryElement {
	
	/** The F il E NAM E KNEEPCAP. */
	public static String FIlE_NAME_KNEEPCAP[] = {"Kneepcap.png"};
	
	/** The F il E NAM E HORIZONTALBONE. */
	public static String FIlE_NAME_HORIZONTALBONE[] = {"HorizontalBone.png"};
	
	/** The F il E NAM E VERTICALBONE. */
	public static String FIlE_NAME_VERTICALBONE[] = {"VerticalBone.png"};
	
	/** The F il E NAM E MONSTE R G ol D. */
	public static String FIlE_NAME_MONSTER_GOlD[] = {"MonsterGold.png"};
	
	/** The F il E NAM E LORANN. */
	public static String FIlE_NAME_LORANN[] = {"LorannUp.png", "LorannRightUp.png", "LorannRight.png", "LorannRightDown.png", "LorannDown.png", "LorannLeftDown.png", "LorannLeft.png", "LorannLeftUp.png"};
	
	/** The F il E NAM E SKELETON. */
	public static String FIlE_NAME_SKELETON[] = {"MonsterSkeleton.png"};
	
	/** The F il E NAM E GHOST. */
	public static String FIlE_NAME_GHOST[] = {"MonsterGhost.png"};
	
	/** The F il E NAM E TOTEM. */
	public static String FIlE_NAME_TOTEM[] = {"MonsterTotem.png"};
	
	/** The F il E NAM E treasure. */
	public static String FIlE_NAME_Treasure[] = {"Treasure.png"};
	
	/** The F il E NAM E KEY. */
	public static String FIlE_NAME_KEY[] = {"Key.png"};
	
	/** The F il E NAM E SPELL. */
	public static String FIlE_NAME_SPELL[] = {"SpellCyan.png", "SpellGreen.png", "SpellMagenta.png", "SpellRed.png", "SpellYellow.png"};
	
	/** The F il E NAM E DOOR. */
	public static String FIlE_NAME_DOOR[] = {"DoorClose.png", "DoorOpen.png"};

	/** The sprite door. */
	public static Sprite SPRITE_DOOR = new Sprite(FIlE_NAME_DOOR);
	
	/** The sprite spell. */
	public static Sprite SPRITE_SPELL = new Sprite(FIlE_NAME_SPELL);
	
	/** The sprite key. */
	public static Sprite SPRITE_KEY = new Sprite(FIlE_NAME_KEY);
	
	/** The sprite treasure. */
	public static Sprite SPRITE_TREASURE = new Sprite(FIlE_NAME_Treasure);
	
	/** The sprite totem. */
	public static Sprite SPRITE_TOTEM = new Sprite(FIlE_NAME_TOTEM);
	
	/** The sprite ghost. */
	public static Sprite SPRITE_GHOST = new Sprite(FIlE_NAME_GHOST);
	
	/** The sprite skeleton. */
	public static Sprite SPRITE_SKELETON = new Sprite(FIlE_NAME_SKELETON);
	
	/** The sprite gold. */
	public static Sprite SPRITE_GOLD = new Sprite(FIlE_NAME_MONSTER_GOlD);

	/** The horizontalbone. */
	public static MotionlessElement HORIZONTALBONE = new MotionlessElement(new Sprite(FIlE_NAME_HORIZONTALBONE), '-');
	
	/** The verticalbone. */
	public static MotionlessElement VERTICALBONE = new MotionlessElement(new Sprite(FIlE_NAME_VERTICALBONE), 'l');
	
	/** The kneepcap. */
	public static MotionlessElement KNEEPCAP = new MotionlessElement(new Sprite(FIlE_NAME_KNEEPCAP), 'o');

	/** The motionless elements. */
	private static MotionlessElement motionlessElements[] = { HORIZONTALBONE, VERTICALBONE, KNEEPCAP, };

	/**
	 * Gets the from file symbol lorann.
	 *
	 * @param c the c
	 * @param lorannWorld the lorann world
	 * @return the from file symbol lorann
	 */
	public static ILorann getfromFileSymbolLorann(final char c, final ILorannWorld lorannWorld)
	{
		if(c == 'L') {
			return new Lorann(new Sprite(FIlE_NAME_LORANN), c, lorannWorld);
		}
		return null;
	}

	/**
	 * Gets the from file symbol motion.
	 *
	 * @param c the c
	 * @param lorannWorld the lorann world
	 * @return the from file symbol motion
	 */
	public static IMobile getFromFileSymbolMotion(final char c, final ILorannWorld lorannWorld) {
		IMobile a = null;
		switch(c){
		case 'G':
			a = new Mobile(SPRITE_GOLD, c, new BehaviorMonsterGold(), lorannWorld);
			break;
		case 's':
			a = new Mobile(SPRITE_SKELETON, c, new BehaviorMonsterSkeleton(), lorannWorld);
			break;
		case 'g':
			a = new Mobile(SPRITE_GHOST, c, new BehaviorMonsterGhost(), lorannWorld);
			break;
		case 'T':
			a = new Mobile(SPRITE_TOTEM, c, new BehaviorMonsterTotem(), lorannWorld);
			break;
		case 't':
			a = new Mobile(SPRITE_TREASURE, c, new BehaviorTreasure(), lorannWorld);
			break;
		case 'k':
			a = new Mobile(SPRITE_KEY, c, new BehaviorKey(), lorannWorld);
			break;
		case 'S':
			a = new Spell(SPRITE_SPELL, c, new BehaviorSpell(), lorannWorld);
			break;
		case 'd':
			a = new Mobile(SPRITE_DOOR, c, new BehaviorDoor(), lorannWorld);
			break;
		default:
			a=null;
			break;
		}
		return a;
	}

	/**
	 * Gets the from file symbol motionless.
	 *
	 * @param c the c
	 * @return the from file symbol motionless
	 */
	public static IMotionlessElement getFromFileSymbolMotionless(final char c) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSymbole() == c) {
				return motionlessElement;
			}
		}
		return null;
	}
}
