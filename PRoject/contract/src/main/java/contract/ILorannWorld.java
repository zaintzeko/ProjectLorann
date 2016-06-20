package contract;

import java.util.ArrayList;
import java.util.Observable;

public interface ILorannWorld {

	public void addElement(IMobile motionElement, int x , int y);

	public void addElement(IMotionlessElement motionlessElement, int x, int y);

	public void addScore(int x);

	public IMotionlessElement getElement(int x, int y);

	public IMotionlessElement[][] getElements();

	int getHeight();

	public ILorann getLorann();

	public IMobile getMobileX(final int x);

	public ArrayList<IMobile> getMotionElements();

	Observable getObservable();

	public int getScore();

	int getWidth();

	public void play();

	public boolean removeMobile(final int x, final int y);

	public void setWin(final int win);
	
	public void addElement(final ILorann lorann, final int x, final int y);
}