package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import contract.IElement;
import contract.ILorann;
import contract.IMotionElement;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	/** The view frame. */
	private ViewFrame					viewFrame;
	private final ArrayList<? extends IMotionElement> motionElements;
	private final IElement motionlessElements[][];
	private final ILorann lorann;
	private final int width;
	private final int height;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame, final ArrayList<? extends IMotionElement> motionElements, final ILorann lorann, final IElement motionlessElements[][], final int width, final int height) {
		this.setViewFrame(viewFrame);
		this.motionElements = motionElements;
		this.motionlessElements = motionlessElements;
		viewFrame.getModel().getObservable().addObserver(this);
		this.width = width;
		this.height = height;
		this.lorann = lorann;
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
		graphics.clearRect(0, 0, this.width, this.height);
		for(int y = 0; y < 12; y++)
		{
			for(int x = 0; x < 20; x++)
			{
				if(this.motionlessElements[x][y]!=null) {
					//System.out.println(this.motionlessElements[x][y].getSymbole());
					graphics.drawImage(this.motionlessElements[x][y].getSprite().getImage(), x*32, y*32, null);
				} else {
					graphics.setColor(new Color(0,0,0));
					graphics.fillRect(x*32, y*32, 32, 32);
				}
			}
		}
		for(final IMotionElement h : this.motionElements)
		{
			graphics.drawImage(h.getSprite().getImage(), h.getX()*32, h.getY()*32, null);
		}
		graphics.drawImage(this.lorann.getSprite().getImage(), this.lorann.getX()*32, this.lorann.getY()*32, null);
		//graphics.drawImage()
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
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
