package controller;

import contract.IController;
import contract.IModel;
import contract.IVecteurDirection;
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

	private final IVecteurDirection vecteurOrder;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
		this.vecteurOrder = new VecteurDirection();
		this.model.getLorannWorld().getLorann().setVecteurOrder(this.vecteurOrder);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */


	public IVecteurDirection getVecteurOrder() {
		return this.vecteurOrder;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final int vecteurX, final int vecteurY, final int numberOfSpell) {
		this.vecteurOrder.setVecteurX(vecteurX);
		this.vecteurOrder.setVecteurY(vecteurY);
		this.vecteurOrder.setNumberOfSpell(numberOfSpell);
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *          the new view
	 */
	private void setView(final IView view) {
		this.view = view;
	}
}
