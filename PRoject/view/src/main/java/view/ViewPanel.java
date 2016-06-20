package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.ILorannWorld;
import contract.IMotionElement;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewPanel.
 */
class ViewPanel extends JPanel implements Observer {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	
	/** The view frame. */
	private ViewFrame					viewFrame;

	/** The lorann world. */
	private final ILorannWorld lorannWorld;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame the view frame
	 * @param lorannWorld the lorann world
	 */
	public ViewPanel(final ViewFrame viewFrame, final ILorannWorld lorannWorld) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
		this.lorannWorld = lorannWorld;
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.lorannWorld.getWidth(), this.lorannWorld.getHeight());
		for(int y = 0; y < 12; y++)
		{
			for(int x = 0; x < 20; x++)
			{
				if(this.lorannWorld.getElement(x, y)!=null) {
					//System.out.println(this.motionlessElements[x][y].getSymbole());
					graphics.drawImage(this.lorannWorld.getElement(x, y).getSprite().getImage(), x*32, y*32, null);
				} else {
					graphics.setColor(new Color(0,0,0));
					graphics.fillRect(x*32, y*32, 32, 32);
				}
			}
		}
		for(int i = 0; i < 20; i++)	{
			graphics.setColor(new Color(0,0,0));
			graphics.fillRect(i*32, 12*32, 32, 32);
		}
		for(final IMotionElement h : this.lorannWorld.getMotionElements())
		{
			graphics.drawImage(h.getSprite().getImage(), h.getX()*32, h.getY()*32, null);
		}
		graphics.drawImage(this.lorannWorld.getLorann().getSpell().getSprite().getImage(), this.lorannWorld.getLorann().getSpell().getX()*32, this.lorannWorld.getLorann().getSpell().getY()*32, null);
		graphics.drawImage(this.lorannWorld.getLorann().getSprite().getImage(), this.lorannWorld.getLorann().getX()*32, this.lorannWorld.getLorann().getY()*32, null);
		graphics.setColor(new Color(255,0,0));
		graphics.drawString("score : " + this.lorannWorld.getScore(), 0, (12*32)-10);
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */

	public void update(final Observable o, final Object arg) {
		this.repaint();
	}
}