package model;

import java.sql.SQLException;
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
	
	private ILorannWorld lorannWorld;
	/**
	 * Instantiates a new model.
	 * @throws SQLException 
	 */
	public Model() throws SQLException {
		this.dao = new DAOLorannWorld(new DBConnection().getConnection());
	
		this.lorannWorld=dao.find(1);
		
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
