package view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IController;
import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class ViewFrame.
 */
class ViewFrame extends JFrame implements KeyListener {

	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -697358409737458175L;

	/** The model. */
	private IModel						model;

	/** The controller. */
	private IController	controller;

	/** The key. */
	private ChangeKeycodeToDirection key;
	
	/**
	 * Instantiates a new view frame.
	 *
	 * @throws HeadlessException the headless exception
	 */
	public ViewFrame() throws HeadlessException {

	}
	
	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @throws HeadlessException the headless exception
	 */
	public ViewFrame(final IModel model) throws HeadlessException {
		this.buildViewFrame(model);
		this.key = new ChangeKeycodeToDirection();
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @param gc the gc
	 */
	public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @param title the title
	 * @throws HeadlessException the headless exception
	 */
	public ViewFrame(final IModel model, final String title) throws HeadlessException {
		super(title);
		this.buildViewFrame(model);
	}

	/**
	 * Instantiates a new view frame.
	 *
	 * @param model the model
	 * @param title the title
	 * @param gc the gc
	 */
	public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildViewFrame(model);
	}

	/**
	 * Builds the view frame.
	 *
	 * @param model the model
	 */
	private void buildViewFrame(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		//System.out.println(model.getLorannWorld());
		this.setContentPane(new ViewPanel(this, model.getLorannWorld()));
		//this.setSize(400 + this.getInsets().left + this.getInsets().right, 60 + this.getInsets().top + this.getInsets().bottom);
		this.setSize(((model.getLorannWorld().getWidth())*32)+6, (model.getLorannWorld().getHeight()+1)*32);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	/**
	 * Gets the controller.
	 *
	 * @return the controller
	 */
	private IController getController() {
		return this.controller;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	protected IModel getModel() {
		return this.model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
	 */
	public void keyPressed(final KeyEvent e) {
		this.key.ActionOnKeyPressed(e.getKeyCode());
		this.controller.orderPerform(this.key.getHorizontalKey(), this.key.getVerticalKey(), this.key.getNumberOfSpell());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(final KeyEvent e) {
		this.key.ActionOnKeyRelease(e.getKeyCode());
		this.controller.orderPerform(this.key.getHorizontalKey(), this.key.getVerticalKey(), this.key.getNumberOfSpell());
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
	 */
	public void keyTyped(final KeyEvent e) {

	}

	/**
	 * Prints the message.
	 *
	 * @param message the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	protected void setController(final IController controller) {
		this.controller = controller;
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}
}
