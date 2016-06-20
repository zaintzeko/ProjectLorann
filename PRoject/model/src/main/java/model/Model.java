package model;

import java.util.Observable;

import contract.ILorannWorld;
import contract.IModel;

// TODO: Auto-generated Javadoc
/**
 * The Class Model.
 */
public class Model implements IModel {

	/** The dao. */
	final DAOLorannWorld dao;

	/** The lorann world. */
	private final ILorannWorld lorannWorld;
	
	/**
	 * Instantiates a new model.
	 *
	 * @param level the level
	 * @throws Exception the exception
	 */
	public Model(final int level) throws Exception {
		this.dao = new DAOLorannWorld(DBConnection.getInstance().getConnection());

		this.lorannWorld=this.dao.find(level);
		//System.out.println(this.lorannWorld);

	}

	/* (non-Javadoc)
	 * @see contract.IModel#getLorannWorld()
	 */
	public ILorannWorld getLorannWorld() {
		// TODO Auto-generated method stub
		return this.lorannWorld;
	}

	/* (non-Javadoc)
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return this.lorannWorld.getObservable();
	}
}
