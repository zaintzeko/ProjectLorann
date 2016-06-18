package view;

import java.awt.event.KeyEvent;

import contract.ControllerOrder;

public class ChangeKeycodeToDirection {
	private int upKey;
	private int downKey;
	private int rightKey;
	private int leftKey;

	public ChangeKeycodeToDirection()
	{
		this.upKey = -1;
		this.downKey = -1;
		this.rightKey = -1;
		this.leftKey = -1;
	}

	/* (non-Javadoc)
	 * @see view.IChangeKeyCodeToDirection#ActionOnKeyPressed(int)
	 */
	public void ActionOnKeyPressed(final int keyCode)
	{
		this.setKey(keyCode, 1);
	}
	/* (non-Javadoc)
	 * @see view.IChangeKeyCodeToDirection#ActionOnKeyRelease(int)
	 */
	public void ActionOnKeyRelease(final int keyCode)
	{
		this.setKey(keyCode, -1);
	}

	/* (non-Javadoc)
	 * @see view.IChangeKeyCodeToDirection#actionToDo()
	 */
	public ControllerOrder actionToDo()
	{
		if((this.upKey > this.downKey) && (this.rightKey > this.leftKey))
		{
			return ControllerOrder.RIGHTUP;
		}
		else if((this.upKey > this.downKey) && (this.rightKey < this.leftKey))
		{
			return ControllerOrder.LEFTUP;
		}
		else if((this.upKey < this.downKey) && (this.rightKey < this.leftKey))
		{
			return ControllerOrder.LEFTDOWN;
		}
		else if((this.upKey < this.downKey) && (this.rightKey > this.leftKey))
		{
			return ControllerOrder.RIGHTDOWN;
		}
		else if((this.upKey > this.downKey))
		{
			return ControllerOrder.UP;
		}
		else if((this.upKey < this.downKey))
		{
			return ControllerOrder.DOWN;
		}
		else if((this.rightKey > this.leftKey))
		{
			return ControllerOrder.RIGHT;
		}
		else if((this.leftKey > this.rightKey))
		{
			return ControllerOrder.LEFT;
		}
		return ControllerOrder.NOMOUVEMENT;
	}

	private void setKey(final int keyCode, final int newValue)
	{
		if(keyCode == KeyEvent.VK_UP)
		{
			this.upKey = newValue;
		}
		else if(keyCode == KeyEvent.VK_RIGHT)
		{
			this.rightKey = newValue;
		}
		else if(keyCode == KeyEvent.VK_DOWN)
		{
			this.downKey = newValue;
		}
		else if(keyCode == KeyEvent.VK_LEFT)
		{
			this.leftKey = newValue;
		}
	}
}
