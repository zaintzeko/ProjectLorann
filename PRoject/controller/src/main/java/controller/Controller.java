package controller;

import contract.IController;
import contract.IModel;
import contract.IVectorDirection;
import contract.IView;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	/** The vecteur order. */
	private final IVectorDirection vecteurOrder;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view the view
	 * @param model the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		this.vecteurOrder = new VectorDirection();
		this.model.getLorannWorld().getLorann().setVectorOrder(this.vecteurOrder);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */


	/**
	 * Gets the vecteur order.
	 *
	 * @return the vecteur order
	 */
	public IVectorDirection getVecteurOrder() {
		return this.vecteurOrder;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final int vectorX, final int vectorY, final int numberOfSpell) {
		this.vecteurOrder.setVectorX(vectorX);
		this.vecteurOrder.setVectorY(vectorY);
		this.vecteurOrder.setNumberOfSpell(numberOfSpell);
	}

	/**
	 * Sets the model.
	 *
	 * @param model the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Sets the view.
	 *
	 * @param view the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}
}
