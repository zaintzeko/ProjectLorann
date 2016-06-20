package view;

import javax.swing.SwingUtilities;

import contract.IController;
import contract.IModel;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class View.
 */
public class View implements IView, Runnable {

	/** The view frame. */
	private final ViewFrame viewFrame;

	/**
	 * @param model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
