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

	final DAOLorannWorld dao;

	private final ILorannWorld lorannWorld;
	/**
	 * Instantiates a new model.
	 * @throws Exception
	 */
	public Model() throws Exception {
		this.dao = new DAOLorannWorld(DBConnection.getInstance().getConnection());

		this.lorannWorld=this.dao.find(1);
		//System.out.println(this.lorannWorld);

	}

	public ILorannWorld getLorannWorld() {
		// TODO Auto-generated method stub
		return this.lorannWorld;
	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return this.lorannWorld.getObservable();
	}
}
