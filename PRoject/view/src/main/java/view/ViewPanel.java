package view;

import contract.IMotionElement;
import contract.IMotionlessElement;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	private ArrayList<? extends IMotionElement> motionElements;
	private IMotionlessElement motionlessElements[][];
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	private int width;
	private int height;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame, final ArrayList<? extends IMotionElement> motionElements, IMotionlessElement motionlessElements[][], int width, int height) {
		this.setViewFrame(viewFrame);
		this.motionElements = motionElements;
		this.motionlessElements = motionlessElements;
		viewFrame.getModel().getObservable().addObserver(this);
		this.width = width;
		this.height = height;
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
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
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.width, this.height);
		for(int i = 0; i < this.width; i += 32)
		{
			for(int j = 0; j < this.height; j+=32)
			{
				graphics.drawImage(this.motionlessElements[j][i].getImage(), j, i, 32, 32, this);
			}
		}
		for(final IMotionElement h : this.motionElements)
		{
			graphics.drawImage(h.getImage(), h.getX()*32, h.getY()*32, h.getWidth(), h.getHeight(), this);
		}
	}
}
