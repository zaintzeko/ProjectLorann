package view;

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
	private ArrayList<? extends IMotionElement> motionElement;
	private IMotionlessElement[][] motionlessElement[][];
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame, final ArrayList<? extends IMotionElement> motionElement, IMotionLessElement motionLessElements[][]) {
		this.setViewFrame(viewFrame);
		this.motionElement = motionElement;
		this.motionlessElement = motionlessElement;
		viewFrame.getModel().getObservable().addObserver(this);
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
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		for(int i = 0; i < this.viewFrame.getModel().getWidth; i++)
		{
			for(int j = 0; j < this.viewFrame.getModel().getWidth; j++)
			{
				graphics.drawImage(this.motionlessElement[j][j].getImage(), j, i, this.motionlessElement[j][j].getWidth(), this.motionlessElement[j][j].getHeight(), this);
			}
		}
		for(final ArrayList<? extends IMotionElement> h : this.motionElement)
		{
			graphics.drawImage(h.getImage(), h.getX(), h.getY(), h.getWidth(), h.getHeight, this);
		}
	}
}
