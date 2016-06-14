package model.lorannWorld.element.motionless;

import model.lorannWorld.element.Permeability;
import model.lorannWorld.element.motion.Lorann;

public class FactoryElement {
private static  Lorann LORANN = new Lorann();
private static MotionlessElement HORIZONTALBONE = new MotionlessElement(null, Permeability.BLOCKING);
private static MotionlessElement VERTICALBONE = new MotionlessElement(null, Permeability.BLOCKING);
private static MotionlessElement KNEEPCAP = new MotionlessElement(null, Permeability.BLOCKING);
private static MotionlessElement TREASURE = new MotionlessElement(null, Permeability.RAMASSABLE);
private static MotionlessElement KEY = new MotionlessElement(null, Permeability.RAMASSABLE);
}
