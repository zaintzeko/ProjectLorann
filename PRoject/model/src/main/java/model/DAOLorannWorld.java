package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import contract.ILorannWorld;
import model.lorannWorld.LorannWorld;

/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class DAOLorannWorld extends DAOEntity<LorannWorld> {

	/**
	 * Instantiates a new DAO hello world.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	public DAOLorannWorld(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#create(model.Entity)
	 */
	@Override
	public boolean create(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	@Override
	public boolean delete(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final LorannWorld entity) {
		// Not implemented
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(int)
	 */
	@Override
	public LorannWorld find(final int level) {
		LorannWorld lorannWorld = new LorannWorld(20, 12);

		try {
			final String sql = "{call LorannMap(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, level);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.next()) {
				lorannWorld.addElement(FactoryElement.getFromStringSymbol(resultSet.getString("nomElement")), resultSet.getInt("x"), resultSet.getInt("y"));
			}
			return lorannWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LorannWorld find(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(ILorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ILorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ILorannWorld entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.DAOEntity#find(java.lang.String)
	 */
	/*@Override
	public LorannWorld find(final String key) {
		LorannWorld lorannWorld = new LorannWorld();

		try {
			final String sql = "{call helloworldByKey(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setString(1, key);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				lorannWorld = new LorannWorld(resultSet.getInt("id"), key, resultSet.getString("message"));
			}
			return lorannWorld;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}*/

}
