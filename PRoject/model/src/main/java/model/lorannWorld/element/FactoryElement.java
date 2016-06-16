package model.lorannWorld.element;

import model.lorannWorld.element.motionless.MotionlessElement;

public abstract class  FactoryElement {
public static MotionlessElement HORIZONTALBONE = new MotionlessElement(null, Permeability.BLOCKING, 'l');
public static MotionlessElement VERTICALBONE = new MotionlessElement(null, Permeability.BLOCKING, '-');
public static MotionlessElement KNEEPCAP = new MotionlessElement(null, Permeability.BLOCKING, 'o');
private static MotionlessElement motionlessElements[] = { HORIZONTALBONE, VERTICALBONE, KNEEPCAP };

public static MotionlessElement getFromFileSymbol(final char c) {
	for (final MotionlessElement motionlessElement : motionlessElements) {
		if (motionlessElement.getSymbole() == c) {
			return motionlessElement;
		}
	}
	return null;
}
}
