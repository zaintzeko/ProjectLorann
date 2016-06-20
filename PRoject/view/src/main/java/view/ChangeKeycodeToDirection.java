package view;

import java.awt.event.KeyEvent;

public class ChangeKeycodeToDirection {
	private int horizontalKey;
	private int verticalKey;
	private int NumberOfSpell;

	public ChangeKeycodeToDirection()
	{
		this.horizontalKey = 0;
		this.verticalKey = 0;
		this.NumberOfSpell = 0;
	}

	/* (non-Javadoc)
	 * @see view.IChangeKeyCodeToDirection#ActionOnKeyPressed(int)
	 */
	public void ActionOnKeyPressed(final int keyCode) {
		this.setKey(keyCode, 1);
	}
	/* (non-Javadoc)
	 * @see view.IChangeKeyCodeToDirection#ActionOnKeyRelease(int)
	 */
	public void ActionOnKeyRelease(final int keyCode)
	{
		this.setKey(keyCode, -1);
	}

	public int getHorizontalKey() {
		return this.horizontalKey;
	}

	public int getNumberOfSpell() {
		return this.NumberOfSpell;
	}

	public int getVerticalKey() {
		return this.verticalKey;
	}

	public void setHorizontalKey(final int horizontalKey) {
		this.horizontalKey = horizontalKey;
	}

	private void setKey(final int keyCode, final int newValue)
	{
		if(keyCode == KeyEvent.VK_UP)
		{
			this.verticalKey -= newValue;
		}
		else if(keyCode == KeyEvent.VK_RIGHT)
		{
			this.horizontalKey += newValue;
		}
		else if(keyCode == KeyEvent.VK_DOWN)
		{
			this.verticalKey += newValue;
		}
		else if(keyCode == KeyEvent.VK_LEFT)
		{
			this.horizontalKey -= newValue;
		}
		else if((keyCode == KeyEvent.VK_SPACE) && (newValue == 1))
		{
			this.NumberOfSpell++;
		}
		else if((keyCode == KeyEvent.VK_SPACE) && (newValue == -1)){
			this.NumberOfSpell = 0;
		}
		this.verifyKey();
	}

	public void setNumberOfSpell(final int numberOfSpell) {
		this.NumberOfSpell = numberOfSpell;
	}

	public void setVerticalKey(final int verticalKey) {
		this.verticalKey = verticalKey;
	}

	private void verifyKey()
	{
		if(this.verticalKey < -1) {
			this.verticalKey = -1;
		}
		if(this.verticalKey > 1) {
			this.verticalKey = 1;
		}
		if(this.horizontalKey < -1) {
			this.horizontalKey = -1;
		}
		if(this.horizontalKey > 1) {
			this.horizontalKey = 1;
		}
		if(this.NumberOfSpell > 1) {
			this.NumberOfSpell = 1;
		}
	}
}
