package model;

import java.util.Observable;

import contract.ILorannWorld;
import contract.IModel;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public class Model implements IModel {

	private ILorannWorld lorannWorld;
	/**
	 * Instantiates a new model.
	 */
	public Model() {
	}

	public ILorannWorld getLorannWorld() {
		// TODO Auto-generated method stub
		return null;
	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return this.lorannWorld.getObservable();
	}
}
