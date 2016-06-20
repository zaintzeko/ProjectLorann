package view;

import java.awt.event.KeyEvent;

// TODO: Auto-generated Javadoc
/**
 * The Class ChangeKeycodeToDirection.
 */
public class ChangeKeycodeToDirection {
	
	/** The horizontal key. */
	private int horizontalKey;
	
	/** The vertical key. */
	private int verticalKey;
	
	/** The Number of spell. */
	private int NumberOfSpell;

	/**
	 * Instantiates a new change keycode to direction.
	 */
	public ChangeKeycodeToDirection()
	{
		this.horizontalKey = 0;
		this.verticalKey = 0;
		this.NumberOfSpell = 0;
	}

	/**
	 * Action on key pressed.
	 *
	 * @param keyCode the key code
	 */
	/* (non-Javadoc)
	 * @see view.IChangeKeyCodeToDirection#ActionOnKeyPressed(int)
	 */
	public void ActionOnKeyPressed(final int keyCode) {
		this.setKey(keyCode, 1);
	}
	
	/**
	 * Action on key release.
	 *
	 * @param keyCode the key code
	 */
	/* (non-Javadoc)
	 * @see view.IChangeKeyCodeToDirection#ActionOnKeyRelease(int)
	 */
	public void ActionOnKeyRelease(final int keyCode)
	{
		this.setKey(keyCode, -1);
	}

	/**
	 * Gets the horizontal key.
	 *
	 * @return the horizontal key
	 */
	public int getHorizontalKey() {
		return this.horizontalKey;
	}

	/**
	 * Gets the number of spell.
	 *
	 * @return the number of spell
	 */
	public int getNumberOfSpell() {
		return this.NumberOfSpell;
	}

	/**
	 * Gets the vertical key.
	 *
	 * @return the vertical key
	 */
	public int getVerticalKey() {
		return this.verticalKey;
	}

	/**
	 * Sets the horizontal key.
	 *
	 * @param horizontalKey the new horizontal key
	 */
	public void setHorizontalKey(final int horizontalKey) {
		this.horizontalKey = horizontalKey;
	}

	/**
	 * Sets the key.
	 *
	 * @param keyCode the key code
	 * @param newValue the new value
	 */
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

	/**
	 * Sets the number of spell.
	 *
	 * @param numberOfSpell the new number of spell
	 */
	public void setNumberOfSpell(final int numberOfSpell) {
		this.NumberOfSpell = numberOfSpell;
	}

	/**
	 * Sets the vertical key.
	 *
	 * @param verticalKey the new vertical key
	 */
	public void setVerticalKey(final int verticalKey) {
		this.verticalKey = verticalKey;
	}

	/**
	 * Verify key.
	 */
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
