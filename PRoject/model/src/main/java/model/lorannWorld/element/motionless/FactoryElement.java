package model.lorannWorld.element.motionless;

import model.lorannWorld.element.Permeability;
import model.lorannWorld.element.motion.Lorann;

public abstract class  FactoryElement {
public static  Lorann LORANN = new Lorann();
public static MotionlessElement HORIZONTALBONE = new MotionlessElement(null, Permeability.BLOCKING);
public static MotionlessElement VERTICALBONE = new MotionlessElement(null, Permeability.BLOCKING);
public static MotionlessElement KNEEPCAP = new MotionlessElement(null, Permeability.BLOCKING);
public static MotionlessElement TREASURE = new MotionlessElement(null, Permeability.RAMASSABLE);
public static MotionlessElement KEY = new MotionlessElement(null, Permeability.RAMASSABLE);
}
